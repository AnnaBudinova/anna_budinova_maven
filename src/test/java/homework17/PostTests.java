package homework17;

import lesson17.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;

public class PostTests extends TestObject {
    @DataProvider(name = "getUsers")
    public Object[][] getUsers() {
        File postPicture = new File("src\\test\\resources\\upload\\testUpload.jpg");
        String caption = "Testing create post caption";

        return new Object[][]{{"anbori@abv.bg", "_Passw0rd", "annabudinova", postPicture, caption}};
    }

    @Test(dataProvider = "getUsers")
    public void testCreatePost(String user, String password, String username, File file, String caption) {
        WebDriver driver = getDriver();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.navigateTo();
        loginPage.login(user, password);

        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isUrlLoaded(), "The Home URL is not correct!");

        Header header = new Header(driver);
        header.clickNewPost();

        NewPostPage newPostPage = new NewPostPage(driver);
        Assert.assertTrue(newPostPage.isUrlLoaded(), "The POST URL is not correct!");
        newPostPage.uploadPicture(file);
        Assert.assertTrue(newPostPage.isImageVisible(), "The image is not visible!");
        Assert.assertEquals(file.getName(), newPostPage.getImageName(), "The image name is incorrect!");
        newPostPage.populatePostCaption(caption);
        newPostPage.clickCreatePost();

        ProfilePage profilePage = new ProfilePage(driver);
        Assert.assertTrue(profilePage.isUrlLoaded(), "The Profile URL is not correct!");
        Assert.assertEquals(profilePage.getPostCount(), 1, "The number of Posts is incorrect!");
        profilePage.clickPost(0);

        PostModal postModal = new PostModal(driver);
        Assert.assertTrue(postModal.isImageVisible(), "The image is not visible!");
        Assert.assertEquals(postModal.getPostTitle(), caption);
        Assert.assertEquals(postModal.getPostUser(), username);
    }

}
