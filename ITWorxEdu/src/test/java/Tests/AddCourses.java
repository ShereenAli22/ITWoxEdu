package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.HomePage;
import Pages.UserRegisteration;
import Pages.CoursesPage;
public class AddCourses extends TestBase {
 HomePage homeObject;
 UserRegisteration RegistObject;
 CoursesPage coursesObject; 
	@Test(priority =1)
	public void CourseAddedSuccesfully() {
		 homeObject = new HomePage(driver);

		 RegistObject= new UserRegisteration(driver);
		 RegistObject.userRegisteration("testregister@aaa.com", "Wakram_123");
		 coursesObject=new CoursesPage(driver);
		 coursesObject.CoursesSideMenu();
		 coursesObject.AddCourse();
		 coursesObject.CourseName("ShereenAli");
		 coursesObject.GradeDropDown(1);
		 coursesObject.subjectaDropDown(1);
		 coursesObject.CourseTeacher();
		 coursesObject.CourseOwner();
		 coursesObject.CreateButton();
		 Assert.assertTrue(coursesObject.ViewedCourse.getText().contains("ShereenAli"));
	}
}
	