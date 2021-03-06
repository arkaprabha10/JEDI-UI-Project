/**
 * 
 */
package com.flipkart.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.flipkart.bean.Course;
import com.flipkart.bean.ReportCard;
import com.flipkart.bean.Student;

import com.flipkart.exception.*;

/**
 * @author rutwi
 *
 */
public interface StudentDaoInterface {
	
	/**
	 * @param StudentID

	 * @param semesterId
	 * @return reportCard
	 * @throws FeesPendingException 
	 * @throws StudentNotApprovedException 
	 */

	public ReportCard viewReportCard(int StudentID, int semesterId) throws GradeNotAddedException, StudentNotApprovedException, FeesPendingException, ReportCardNotGeneratedException;

/*
	/**
	 * @param studentID
	 * @param catalog
	 */

	public List<Course> viewRegisteredCourses(int studentID, int semesterId) throws StudentNotRegisteredException;
	public Student addStudent(Student student) throws UserAlreadyInUseException;
	
	public int getStudentIDFromUserName(String username) throws StudentNotRegisteredException;
	
}
