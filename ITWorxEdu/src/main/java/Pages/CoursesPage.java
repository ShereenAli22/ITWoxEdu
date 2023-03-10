package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;



public class CoursesPage extends PageBase{

	public CoursesPage(WebDriver driver) {
		super(driver);
	}
 
	@FindBy(id="btnMyCoursesList")
	public WebElement CourseSideMenu;
	
	@FindBy(id="btnListAddCourse")
	public WebElement AddCourseBTN;
	
	@FindBy(id="txtCourseName")
	public WebElement CourseName;
	
	@FindBy(id="teacherOnBehalf")
	public WebElement CourseTeacher;
	
	@FindBy(id="lnkCourseOwnerMail")
	public WebElement CourseOwner;
	
	@FindBy(id="btnSaveAsDraftCourse")
	public WebElement CreateBtn;
	
	@FindBy(id="courseSubject")
	public WebElement SubjectDropDownList;
	@FindBy(id="courseGrade")
	public WebElement CourseGradeDropDown;
	
	@FindBy(id="courseNameView")
	public WebElement ViewedCourse;
	
	public void CoursesSideMenu() {

		ClickButton(CourseSideMenu);
	}
	public void AddCourse() {

		ClickButton(AddCourseBTN);
	}
	public void CourseTeacher() {

		ClickButton(CourseTeacher);	
	}
	public void CourseOwner() {

		ClickButton(CourseOwner);	
	}
	
	public void CreateButton() {

		ClickButton(CreateBtn);	
	}
	 public void CourseName(String TheCourseName) {
		  setTextElementText ( CourseName ,  TheCourseName );
	  }
	 public  void subjectaDropDown(int index) {
	      Select drop = new Select(SubjectDropDownList);
	      drop.selectByIndex(index);  
	}
	 public  void GradeDropDown(int index) {
	      Select drop = new Select(CourseGradeDropDown);
	      drop.selectByIndex(index);  
	}
	
}
