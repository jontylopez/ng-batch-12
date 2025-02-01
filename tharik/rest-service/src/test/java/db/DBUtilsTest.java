/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package db;

import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author hd
 */
public class DBUtilsTest {
    
    public DBUtilsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getStudent method, of class DBUtils.
     */
    @Test
    public void testGetStudent() throws Exception {
        Student expResult = new Student(999, "Carlos Sainz");
        DBUtils instance = new DBUtils();
         
        // Test the adding
        boolean added = instance.addStudent(expResult);
        assertEquals(added, true);
        
        // Test the reading
        Student result = instance.getStudent(expResult.getId());
        assertEquals(expResult.getId(), result.getId());
        assertEquals(expResult.getName(), result.getName());
        
        
        // Test the updating
        expResult.setName("Lando Norris");
        boolean updated = instance.updateStudent(expResult);
        assertEquals(updated, true);
        
        // Test the reading
        result = instance.getStudent(expResult.getId());
        assertEquals(expResult.getId(), result.getId());
        assertEquals(expResult.getName(), result.getName());
        
        // Test the deleting
        boolean deleted = instance.deleteStudent(expResult.getId());
        assertEquals(deleted, true);
        
        // Test the reading
        result = instance.getStudent(expResult.getId());
        assertEquals(null, result);
        
        
    }

//    /**
//     * Test of getStudents method, of class DBUtils.
//     */
//    @Test
//    public void testGetStudents() {
//        System.out.println("getStudents");
//        DBUtils instance = new DBUtils();
//        List<Student> expResult = null;
//        List<Student> result = instance.getStudents();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of addStudent method, of class DBUtils.
//     */
//    @Test
//    public void testAddStudent() {
//        System.out.println("addStudent");
//        Student st = null;
//        DBUtils instance = new DBUtils();
//        boolean expResult = false;
//        boolean result = instance.addStudent(st);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of updateStudent method, of class DBUtils.
//     */
//    @Test
//    public void testUpdateStudent() {
//        System.out.println("updateStudent");
//        Student st = null;
//        DBUtils instance = new DBUtils();
//        boolean expResult = false;
//        boolean result = instance.updateStudent(st);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of deleteStudent method, of class DBUtils.
//     */
//    @Test
//    public void testDeleteStudent() {
//        System.out.println("deleteStudent");
//        int id = 0;
//        DBUtils instance = new DBUtils();
//        boolean expResult = false;
//        boolean result = instance.deleteStudent(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
