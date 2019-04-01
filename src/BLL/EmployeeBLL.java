/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.EmployeeDAL;
import DTO.Employee;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manng
 */
public class EmployeeBLL {

    EmployeeDAL dal = new EmployeeDAL();

    public ArrayList<Employee> ReadEmployeeBll() {
        ArrayList<Employee> listEmployee = new ArrayList<>();
        listEmployee = dal.readEmployee();
        return listEmployee;
    }
    public ArrayList<Employee> ReadCB1Bll() {
        ArrayList<Employee> listEmployee = new ArrayList<>();
        listEmployee = dal.readCB1();
        return listEmployee;
    }
    public ArrayList<Employee> ReadCB2Bll() {
        ArrayList<Employee> listEmployee = new ArrayList<>();
        listEmployee = dal.readCB2();
        return listEmployee;
    }
    public ArrayList<Employee> ReadCB3Bll() {
        ArrayList<Employee> listEmployee = new ArrayList<>();
        listEmployee = dal.readCB3();
        return listEmployee;
    }
    public ArrayList<Employee> ReadCB4Bll() {
        ArrayList<Employee> listEmployee = new ArrayList<>();
        listEmployee = dal.readCB4();
        return listEmployee;
    }
    public ArrayList<Employee> ReadCB5Bll() {
        ArrayList<Employee> listEmployee = new ArrayList<>();
        listEmployee = dal.readCB5();
        return listEmployee;
    }
    public ArrayList<Employee> ReadCB6Bll() {
        ArrayList<Employee> listEmployee = new ArrayList<>();
        listEmployee = dal.readCB6();
        return listEmployee;
    }
    public ArrayList<Employee> ReadCB7Bll() {
        ArrayList<Employee> listEmployee = new ArrayList<>();
        listEmployee = dal.readCB7();
        return listEmployee;
    }
    public ArrayList<Employee> ReadCB8Bll() {
        ArrayList<Employee> listEmployee = new ArrayList<>();
        listEmployee = dal.readCB8();
        return listEmployee;
    }
    public ArrayList<Employee> ReadCB9Bll() {
        ArrayList<Employee> listEmployee = new ArrayList<>();
        listEmployee = dal.readCB9();
        return listEmployee;
    }
    public ArrayList<Employee> ReadCB10Bll() {
        ArrayList<Employee> listEmployee = new ArrayList<>();
        listEmployee = dal.readCB10();
        return listEmployee;
    }
    public ArrayList<Employee> ReadCB11Bll() {
        ArrayList<Employee> listEmployee = new ArrayList<>();
        listEmployee = dal.readCB11();
        return listEmployee;
    }
    public ArrayList<Employee> ReadCB12Bll() {
        ArrayList<Employee> listEmployee = new ArrayList<>();
        listEmployee = dal.readCB12();
        return listEmployee;
    }
    public ArrayList<Employee> ReadCB13Bll() {
        ArrayList<Employee> listEmployee = new ArrayList<>();
        listEmployee = dal.readCB13();
        return listEmployee;
    }
    public ArrayList<Employee> ReadCB14Bll() {
        ArrayList<Employee> listEmployee = new ArrayList<>();
        listEmployee = dal.readCB14();
        return listEmployee;
    }
    public ArrayList<Employee> ReadCB15Bll() {
        ArrayList<Employee> listEmployee = new ArrayList<>();
        listEmployee = dal.readCB15();
        return listEmployee;
    }
    public ArrayList<Employee> ReadCB16Bll() {
        ArrayList<Employee> listEmployee = new ArrayList<>();
        listEmployee = dal.readCB16();
        return listEmployee;
    }
    public ArrayList<Employee> ReadCB17Bll() {
        ArrayList<Employee> listEmployee = new ArrayList<>();
        listEmployee = dal.readCB17();
        return listEmployee;
    }

    public void AddNewEmployeeDAL(Employee employeeModel) {
        try {
            dal.AddNewEmployee(employeeModel);
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//
    public void EditEmployeeDAL(Employee employeeModel) {
        try {
            dal.EditEmployee(employeeModel);
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeBLL.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
     public void DeleteEmployeeDAL(int MaNV) {
        try {
            dal.DeleteEmployee(MaNV);
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeBLL.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}
