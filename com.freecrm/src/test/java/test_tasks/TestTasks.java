package test_tasks;

import base.BasePage;
import dashboard_page.DashboardPage;
import home_page.HomePage;
import loginpage.LoginPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import taskspage.TasksPage;
import utils.ExcelData;

public class TestTasks extends BasePage {
    @Test(dataProvider = "createTaskDataProvider")
    public void testCreateTask(String title){

        HomePage homePage =new HomePage();

        LoginPage logInPage= homePage.clickOnLoginButton();
        String email1 = "sarafaty07@gmail.com";
        String password="Sara1994";
        DashboardPage dashboardPage= logInPage.doLogin(email1,password);

        TasksPage tasksPage=dashboardPage.hoverClickOnTasksIcon();

        tasksPage.doAddNewTask(title);
        Assert.assertTrue(isElementVisible(tasksPage.titleOfCreatedTask));

    }

    @DataProvider(name="createTaskDataProvider")
    public Object [][] addContactDataProvider() {

        String path= System.getProperty("user.dir")+"\\src\\test\\resources\\test_data2.xlsx";
        ExcelData ex=new ExcelData(path);
        String data[][]=ex.readStringArrays("testTasks");
        return data;

    }
}

