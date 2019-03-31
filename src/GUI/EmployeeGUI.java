/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.EmployeeBLL;
import DTO.Employee;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author NAT
 */
public class EmployeeGUI extends javax.swing.JFrame {
    EmployeeBLL employeeBLL = new EmployeeBLL();
    Employee employeeModel;
    /**
     * Creates new form Employee
     */
    public EmployeeGUI() {
        initComponents();
       // stateButton(true);
         setInfoDialog();
         LoadCB1();
         LoadCB2();
         LoadCB3();
         LoadCB4();
         LoadCB5();
         LoadCB6();
         LoadCB7();
         LoadCB8();
         LoadCB9();
         LoadCB10();
         LoadCB11();
         LoadCB12();
         LoadCB13();
         LoadCB14();
         LoadCB15();
         LoadCB16();
         LoadCB17();
    }
    public  void setInfoDialog() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - getHeight()) / 2);
        setLocation(x, y);        
        setResizable(false);
    }
    public Employee getEmployee() {
		return employeeModel;
	}
    
    private void LoadCB1() {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        ArrayList<Employee> employeeListModel = employeeBLL.ReadCB1Bll();
        Employee employeeModel = new Employee();
        for (int i = 0; i < employeeListModel.size(); i++) {
        employeeModel = employeeListModel.get(i);
            model.addElement( employeeModel.getPhai());
        }         
            //System.out.println("ID GUI" + employeeModel);     
            jComboBox1.setModel(model);
            employeeListModel.clear();
    }
    private void LoadCB2() {
        DefaultComboBoxModel model1 = new DefaultComboBoxModel();
        ArrayList<Employee> employeeListModel = employeeBLL.ReadCB2Bll();
        Employee employeeModel = new Employee();
        for (int i = 0; i < employeeListModel.size(); i++) {
        employeeModel = employeeListModel.get(i);
            model1.addElement( employeeModel.getNoiSinh());
        }         
            //System.out.println("ID GUI" + employeeModel);     
            jComboBox5.setModel(model1);
            employeeListModel.clear();
    }
    private void LoadCB3() {
        DefaultComboBoxModel model2 = new DefaultComboBoxModel();
        ArrayList<Employee> employeeListModel = employeeBLL.ReadCB3Bll();
        Employee employeeModel = new Employee();
        for (int i = 0; i < employeeListModel.size(); i++) {
        employeeModel = employeeListModel.get(i);
            model2.addElement( employeeModel.getBangCap());
        }         
            //System.out.println("ID GUI" + employeeModel);     
            jComboBox11.setModel(model2);
            employeeListModel.clear();
    }
    private void LoadCB4() {
        DefaultComboBoxModel model4 = new DefaultComboBoxModel();
        ArrayList<Employee> employeeListModel = employeeBLL.ReadCB4Bll();
        Employee employeeModel = new Employee();
        for (int i = 0; i < employeeListModel.size(); i++) {
        employeeModel = employeeListModel.get(i);
            model4.addElement( employeeModel.getBoPhan());
        }         
            //System.out.println("ID GUI" + employeeModel);     
            jComboBox16.setModel(model4);
            employeeListModel.clear();
    }
    private void LoadCB5() {
        DefaultComboBoxModel model5 = new DefaultComboBoxModel();
        ArrayList<Employee> employeeListModel = employeeBLL.ReadCB5Bll();
        Employee employeeModel = new Employee();
        for (int i = 0; i < employeeListModel.size(); i++) {
        employeeModel = employeeListModel.get(i);
            model5.addElement( employeeModel.getChucDanh());
        }         
            //System.out.println("ID GUI" + employeeModel);     
            jComboBox13.setModel(model5);
            employeeListModel.clear();
    }
    private void LoadCB6() {
        DefaultComboBoxModel model6 = new DefaultComboBoxModel();
        ArrayList<Employee> employeeListModel = employeeBLL.ReadCB6Bll();
        Employee employeeModel = new Employee();
        for (int i = 0; i < employeeListModel.size(); i++) {
        employeeModel = employeeListModel.get(i);
            model6.addElement( employeeModel.getChucVu());
        }         
            //System.out.println("ID GUI" + employeeModel);     
            jComboBox15.setModel(model6);
            employeeListModel.clear();
    }
    private void LoadCB7() {
        DefaultComboBoxModel model7 = new DefaultComboBoxModel();
        ArrayList<Employee> employeeListModel = employeeBLL.ReadCB7Bll();
        Employee employeeModel = new Employee();
        for (int i = 0; i < employeeListModel.size(); i++) {
        employeeModel = employeeListModel.get(i);
            model7.addElement( employeeModel.getNoiCapCMND());
        }         
            //System.out.println("ID GUI" + employeeModel);     
            jComboBox6.setModel(model7);
            employeeListModel.clear();
    }
    private void LoadCB8() {
        DefaultComboBoxModel model8 = new DefaultComboBoxModel();
        ArrayList<Employee> employeeListModel = employeeBLL.ReadCB8Bll();
        Employee employeeModel = new Employee();
        for (int i = 0; i < employeeListModel.size(); i++) {
        employeeModel = employeeListModel.get(i);
            model8.addElement( employeeModel.getDanToc());
        }         
            //System.out.println("ID GUI" + employeeModel);     
            jComboBox2.setModel(model8);
            employeeListModel.clear();
    }
    private void LoadCB9() {
        DefaultComboBoxModel model9 = new DefaultComboBoxModel();
        ArrayList<Employee> employeeListModel = employeeBLL.ReadCB9Bll();
        Employee employeeModel = new Employee();
        for (int i = 0; i < employeeListModel.size(); i++) {
        employeeModel = employeeListModel.get(i);
            model9.addElement( employeeModel.getDiaDiemLamViec());
        }         
            //System.out.println("ID GUI" + employeeModel);     
            jComboBox17.setModel(model9);
            employeeListModel.clear();
    }
    private void LoadCB10() {
        DefaultComboBoxModel model10 = new DefaultComboBoxModel();
        ArrayList<Employee> employeeListModel = employeeBLL.ReadCB10Bll();
        Employee employeeModel = new Employee();
        for (int i = 0; i < employeeListModel.size(); i++) {
        employeeModel = employeeListModel.get(i);
            model10.addElement( employeeModel.getDonVi());
        }         
            //System.out.println("ID GUI" + employeeModel);     
            jComboBox12.setModel(model10);
            employeeListModel.clear();
    }
    private void LoadCB11() {
        DefaultComboBoxModel model11 = new DefaultComboBoxModel();
        ArrayList<Employee> employeeListModel = employeeBLL.ReadCB11Bll();
        Employee employeeModel = new Employee();
        for (int i = 0; i < employeeListModel.size(); i++) {
        employeeModel = employeeListModel.get(i);
            model11.addElement( employeeModel.getLoaiNhanVien());
        }         
            //System.out.println("ID GUI" + employeeModel);     
            jComboBox10.setModel(model11);
            employeeListModel.clear();
    }
    private void LoadCB12() {
        DefaultComboBoxModel model12 = new DefaultComboBoxModel();
        ArrayList<Employee> employeeListModel = employeeBLL.ReadCB12Bll();
        Employee employeeModel = new Employee();
        for (int i = 0; i < employeeListModel.size(); i++) {
        employeeModel = employeeListModel.get(i);
            model12.addElement( employeeModel.getNganHang());
        }         
            //System.out.println("ID GUI" + employeeModel);     
            jComboBox9.setModel(model12);
            employeeListModel.clear();
    }
    private void LoadCB13() {
        DefaultComboBoxModel model13 = new DefaultComboBoxModel();
        ArrayList<Employee> employeeListModel = employeeBLL.ReadCB13Bll();
        Employee employeeModel = new Employee();
        for (int i = 0; i < employeeListModel.size(); i++) {
        employeeModel = employeeListModel.get(i);
            model13.addElement( employeeModel.getPhongBan());
        }         
            //System.out.println("ID GUI" + employeeModel);     
            jComboBox14.setModel(model13);
            employeeListModel.clear();
    }
    private void LoadCB14() {
        DefaultComboBoxModel model14 = new DefaultComboBoxModel();
        ArrayList<Employee> employeeListModel = employeeBLL.ReadCB14Bll();
        Employee employeeModel = new Employee();
        for (int i = 0; i < employeeListModel.size(); i++) {
        employeeModel = employeeListModel.get(i);
            model14.addElement( employeeModel.getTonGiao());
        }         
            //System.out.println("ID GUI" + employeeModel);     
            jComboBox4.setModel(model14);
            employeeListModel.clear();
    }
    private void LoadCB15() {
        DefaultComboBoxModel model15 = new DefaultComboBoxModel();
        ArrayList<Employee> employeeListModel = employeeBLL.ReadCB15Bll();
        Employee employeeModel = new Employee();
        for (int i = 0; i < employeeListModel.size(); i++) {
        employeeModel = employeeListModel.get(i);
            model15.addElement( employeeModel.getTrinhDo());
        }         
            //System.out.println("ID GUI" + employeeModel);     
            jComboBox8.setModel(model15);
            employeeListModel.clear();
    }
    private void LoadCB16() {
        DefaultComboBoxModel model16 = new DefaultComboBoxModel();
        ArrayList<Employee> employeeListModel = employeeBLL.ReadCB16Bll();
        Employee employeeModel = new Employee();
        for (int i = 0; i < employeeListModel.size(); i++) {
        employeeModel = employeeListModel.get(i);
            model16.addElement( employeeModel.getTinhTrangHonNhan());
        }         
            //System.out.println("ID GUI" + employeeModel);     
            jComboBox3.setModel(model16);
            employeeListModel.clear();
    }
    private void LoadCB17() {
        DefaultComboBoxModel model17 = new DefaultComboBoxModel();
        ArrayList<Employee> employeeListModel = employeeBLL.ReadCB17Bll();
        Employee employeeModel = new Employee();
        for (int i = 0; i < employeeListModel.size(); i++) {
        employeeModel = employeeListModel.get(i);
            model17.addElement( employeeModel.getQuocTich());
        }         
            //System.out.println("ID GUI" + employeeModel);     
            jComboBox7.setModel(model17);
            employeeListModel.clear();
    }

//    public void setEmployee (Employee employee) {	
//        this.employeeModel = employee;
//        jTextField1.setText(String.valueOf(employee.getMaNV()));
//        jComboBox1.setSelectedItem(employee.getPhai());
//        jTextField2.setText(String.valueOf(employee.getCMND()));
//        jTextField3.setText(String.valueOf(employee.getDiaChiThuongTru()));
//        jTextField4.setText(String.valueOf(employee.getDiaChiTamTru()));
//        jTextField5.setText(String.valueOf(employee.getEmail()));
//        
//        
//    }
    public void stateButton(boolean value){
//        
//        btNew.setVisible(value);
//        btEdit.setVisible(value);
//        btDelete.setVisible(value);
//        btPrint.setVisible(value);
//        btClose.setVisible(value);
        btSave.setVisible(!value);
        btCancel.setVisible(!value);
//        
    }
    protected boolean validateInput() {
		int MaNV = Integer.parseInt(jTextField1.getText());	
                String cbPhai = jComboBox1.getSelectedItem().toString() ;
		int CMND = Integer.parseInt(jTextField2.getText());                         
                String NgayCapCM = ns.format(jDateChooser5.getDate());                            
                String cbNoiCapCM = jComboBox6.getSelectedItem().toString() ;
                String Sothe = jTextField8.getText();
                String HoTen = jTextField15.getText();                
                String NamSinh = ns.format(jDateChooser4.getDate());   
               // Date NamSinh = jDateChooser4.getDate();
                String cbNS = jComboBox5.getSelectedItem().toString() ;                            
                String DiaChiThuongTru = jTextField3.getText();
                String DiaChiTamTru = jTextField4.getText();
                int DienThoaiThuongChu = Integer.parseInt(jTextField16.getText());
                int DiDong = Integer.parseInt(jTextField17.getText());
                String Email = jTextField5.getText();
                String NgayVaoDoan = ns.format(jDateChooser6.getDate());                
                String NgayVaoDang = ns.format(jDateChooser7.getDate());
                String cbDt = jComboBox2.getSelectedItem().toString() ;
                String cbTG = jComboBox4.getSelectedItem().toString() ;
                String cbQuocTich = jComboBox7.getSelectedItem().toString() ;
                int Passport = Integer.parseInt(jTextField6.getText());
                String NgayCapPassport = ns.format(jDateChooser8.getDate());
                String NoiCapPassport = jTextField19.getText();                                
                String cbTTHN = jComboBox3.getSelectedItem().toString() ;
                int MaSoThue = Integer.parseInt(jTextField13.getText());
                String NgayCapMST = ns.format(jDateChooser9.getDate());
                int SoTaiKhoan = Integer.parseInt(jTextField7.getText());
                String MaTaiKhoan = jTextField14.getText();
                String cbNH = jComboBox9.getSelectedItem().toString() ;
                String cbTD = jComboBox8.getSelectedItem().toString() ;
                String cbBC = jComboBox11.getSelectedItem().toString() ;
                String HocHam = jTextField22.getText();
                String ChuyenMon = jTextField21.getText();
                String KNLVChuyenMon = jTextField23.getText();
		String cbLNV = jComboBox10.getSelectedItem().toString() ;
                String cbDV = jComboBox12.getSelectedItem().toString() ;
                String cbPB = jComboBox14.getSelectedItem().toString() ;
                String cbBP = jComboBox16.getSelectedItem().toString() ;
                String cbCD = jComboBox13.getSelectedItem().toString() ;     
                String cbCV = jComboBox15.getSelectedItem().toString() ;                
                String cbDDLV = jComboBox17.getSelectedItem().toString() ;
                String LuongTV = jTextField25.getText() ;
                String LuongCB = jTextField26.getText();
                String LuongKD = jTextField27.getText();
                String NgayVaoCty = ns.format(jDateChooser2.getDate());
                String NgayHetHanTV = ns.format(jDateChooser3.getDate());
                String NgayVaoChinhThuc = ns.format(jDateChooser10.getDate());
                if (employeeModel == null) {		
			employeeModel = new Employee();
		}
		employeeModel.setMaNV(MaNV);
		employeeModel.setPhai(cbPhai);                
		employeeModel.setCMND(CMND);
                employeeModel.setNgayCapCMND(NgayCapCM);
                employeeModel.setNoiCapCMND(cbNoiCapCM);
                employeeModel.setSothe(Sothe);
                employeeModel.setHoTen(HoTen);
                employeeModel.setNamSinh(NamSinh);
                employeeModel.setNoiSinh(cbNS);
                employeeModel.setDiaChiThuongTru(DiaChiThuongTru);
                employeeModel.setDiaChiTamTru(DiaChiTamTru);
                employeeModel.setDienThoaiThuongTru(DienThoaiThuongChu);
                employeeModel.setDiDong(DiDong);
                employeeModel.setEmail(Email);
                employeeModel.setNgayVaoDoan(NgayVaoDoan);
                employeeModel.setNgayVaoDang(NgayVaoDang);
                employeeModel.setDanToc(cbDt);
                employeeModel.setTonGiao(cbTG);
                employeeModel.setQuocTich(cbQuocTich);               
		employeeModel.setPassport(Passport);
                employeeModel.setNgayCapPassport(NgayCapPassport);
                employeeModel.setNoiCapPassport(NoiCapPassport);
                employeeModel.setTinhTrangHonNhan(cbTTHN);
                employeeModel.setMaSoThue(MaSoThue);
                employeeModel.setNgayCapMST(NgayCapMST);
                employeeModel.setSoTaiKhoan(SoTaiKhoan);
                employeeModel.setMaTaiKhoan(MaTaiKhoan);
                employeeModel.setNganHang(cbNH);
                employeeModel.setTrinhDo(cbTD);
                employeeModel.setBangCap(cbBC);
                employeeModel.setHocHam(HocHam);
                employeeModel.setChuyenMon(ChuyenMon);
                employeeModel.setKNLVChuyenMon(KNLVChuyenMon);
                employeeModel.setLoaiNhanVien(cbLNV);
                employeeModel.setDonVi(cbDV);
                employeeModel.setPhongBan(cbPB);
                employeeModel.setBoPhan(cbBP);
                employeeModel.setChucDanh(cbCD);
                employeeModel.setChucVu(cbCV);
                employeeModel.setDiaDiemLamViec(cbDDLV);
                employeeModel.setLuongThuViec(LuongTV);
                employeeModel.setLuongCB(LuongCB);
                employeeModel.setLuongKD(LuongKD);
                employeeModel.setNgayVaoCty(NgayVaoCty);
                employeeModel.setNgayVaoChinhThuc(NgayVaoChinhThuc);
                employeeModel.setNgayHetHanTV(NgayHetHanTV);
                employeeBLL.AddNewEmployeeDAL(employeeModel);			
		return true;
	}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField6 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField7 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jComboBox7 = new javax.swing.JComboBox<>();
        jTextField19 = new javax.swing.JTextField();
        jComboBox9 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jDateChooser5 = new com.toedter.calendar.JDateChooser();
        jDateChooser6 = new com.toedter.calendar.JDateChooser();
        jDateChooser7 = new com.toedter.calendar.JDateChooser();
        jDateChooser8 = new com.toedter.calendar.JDateChooser();
        jDateChooser9 = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jComboBox8 = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        jComboBox11 = new javax.swing.JComboBox<>();
        jTextField21 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jComboBox10 = new javax.swing.JComboBox<>();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jDateChooser10 = new com.toedter.calendar.JDateChooser();
        jPanel6 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jComboBox12 = new javax.swing.JComboBox<>();
        jComboBox13 = new javax.swing.JComboBox<>();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jComboBox14 = new javax.swing.JComboBox<>();
        jComboBox15 = new javax.swing.JComboBox<>();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jComboBox16 = new javax.swing.JComboBox<>();
        jComboBox17 = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jTextField26 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jTextField27 = new javax.swing.JTextField();
        btCancel = new javax.swing.JButton();
        btSave = new javax.swing.JButton();
        btSua = new javax.swing.JButton();

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin cá nhân", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Mã NV");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 100, -1));

        jLabel2.setText("Phái");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 45, 100, -1));

        jLabel3.setText("CMND");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 76, 100, -1));

        jLabel4.setText("Địa chỉ thường trú");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 109, 100, -1));

        jLabel5.setText("Địa chỉ tạm trú");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 100, -1));

        jLabel6.setText("Email");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 166, 100, -1));

        jLabel7.setText("Dân tộc");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 192, 100, -1));

        jLabel8.setText("Passport");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 218, 100, -1));

        jLabel9.setText("Tình trạng hôn nhân");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 249, 100, -1));

        jLabel10.setText("Số tài khoản");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 100, -1));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 11, 171, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 42, 171, -1));
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 73, 171, -1));
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 106, 456, -1));
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 137, 456, -1));
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 163, 167, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 189, 167, -1));
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 215, 167, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 246, 167, -1));
        jPanel2.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 277, 167, -1));

        jLabel11.setText("Số thẻ");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 14, 100, -1));
        jPanel2.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 11, 180, -1));

        jLabel12.setText("Năm sinh");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 45, 100, -1));

        jLabel13.setText("Ngày cấp CMND");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 76, 100, -1));

        jLabel14.setText("Ngày vào đoàn");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 166, 100, -1));

        jLabel15.setText("Tôn giáo");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 192, 100, -1));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 189, 175, -1));

        jLabel16.setText("Ngày cấp passport");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 218, 100, -1));

        jLabel17.setText("Mã số thuế");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 249, 100, -1));
        jPanel2.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 246, 175, -1));

        jLabel18.setText("Mã tài khoản");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 280, 100, -1));
        jPanel2.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 277, 175, -1));

        jLabel19.setText("Họ lót");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 14, 100, -1));

        jLabel20.setText("Nơi sinh");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 45, 100, -1));

        jLabel21.setText("Nơi cấp CMND");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 76, -1, -1));

        jLabel22.setText("Điên thoại thường trú");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 109, 100, -1));

        jLabel23.setText("Di đông");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 140, 100, -1));

        jLabel24.setText("Ngày vào đảng");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 166, 100, -1));

        jLabel25.setText("Quốc tịch");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 192, 100, -1));

        jLabel26.setText("Nơi cấp passport");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 218, 100, -1));

        jLabel27.setText("Ngày cấp MST");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 249, -1, -1));

        jLabel28.setText("Ngân hàng");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 280, 100, -1));
        jPanel2.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 11, 203, -1));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 42, 203, -1));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 73, 203, -1));
        jPanel2.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 106, 203, -1));
        jPanel2.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 137, 203, -1));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 189, 203, -1));
        jPanel2.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 215, 203, -1));

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 280, 470, -1));

        jButton1.setText("Chọn tệp");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(34, 34, 34))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(887, 0, 260, 266));
        jPanel2.add(jDateChooser4, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 40, 180, -1));
        jPanel2.add(jDateChooser5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 180, -1));

        jDateChooser6.setDateFormatString("dd/MM/yyyy");
        jPanel2.add(jDateChooser6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 180, -1));
        jPanel2.add(jDateChooser7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 200, -1));

        jDateChooser8.setDateFormatString("dd/MM/yyyy");
        jPanel2.add(jDateChooser8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 180, -1));
        jPanel2.add(jDateChooser9, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, 200, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bằng cấp kinh nghiệm", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setText("Trình độ");
        jPanel4.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 30, 100, -1));

        jLabel30.setText("Chuyên môn");
        jPanel4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 86, 100, -1));

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel4.add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 27, 167, -1));

        jLabel31.setText("Bằng cấp");
        jPanel4.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 30, 100, -1));

        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel4.add(jComboBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 175, -1));
        jPanel4.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 83, 460, -1));

        jLabel32.setText("Học hàm");
        jPanel4.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 30, 100, -1));

        jLabel33.setText("KNLV chuyên môn");
        jPanel4.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 86, 100, -1));
        jPanel4.add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 27, 202, -1));
        jPanel4.add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 83, 35, -1));

        jLabel34.setText("năm");
        jPanel4.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 86, 50, -1));
        jPanel4.add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(771, 83, 35, -1));

        jLabel35.setText("tháng");
        jPanel4.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 86, 50, -1));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ngày vào làm", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setText("Loại nhân viên");
        jPanel5.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 30, 100, -1));

        jLabel37.setText("Ngày vào chính thức");
        jPanel5.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 73, 100, -1));

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel5.add(jComboBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 27, 170, -1));

        jLabel38.setText("Ngày vào công ty");
        jPanel5.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 30, 100, -1));

        jLabel39.setText("Ngày hết hạn TV");
        jPanel5.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 27, 100, 20));
        jPanel5.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 27, 175, -1));
        jPanel5.add(jDateChooser3, new org.netbeans.lib.awtextra.AbsoluteConstraints(677, 27, 202, -1));
        jPanel5.add(jDateChooser10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 170, -1));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nơi làm việc", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel40.setText("Đơn vị ");
        jPanel6.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 30, 100, -1));

        jLabel41.setText("Chức danh");
        jPanel6.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 73, 100, -1));

        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel6.add(jComboBox12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 27, 170, -1));

        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel6.add(jComboBox13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 170, -1));

        jLabel42.setText("Phòng ban ");
        jPanel6.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 27, 100, 20));

        jLabel43.setText("Chức vụ");
        jPanel6.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 70, 100, 20));

        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel6.add(jComboBox14, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 27, 175, -1));

        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel6.add(jComboBox15, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 70, 175, -1));

        jLabel44.setText("Bộ phận");
        jPanel6.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(747, 30, 100, -1));

        jLabel45.setText("Địa điểm làm việc");
        jPanel6.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(747, 73, 100, -1));

        jComboBox16.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel6.add(jComboBox16, new org.netbeans.lib.awtextra.AbsoluteConstraints(938, 27, 202, -1));

        jComboBox17.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel6.add(jComboBox17, new org.netbeans.lib.awtextra.AbsoluteConstraints(938, 70, 202, -1));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin lương nhân viên", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel46.setText("Lương thử việc");
        jLabel46.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel7.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 48, 100, -1));
        jPanel7.add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 45, 250, -1));

        jLabel47.setText("Lương CB");
        jPanel7.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 48, 100, -1));
        jPanel7.add(jTextField26, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 45, 250, -1));

        jLabel48.setText("Lương KD");
        jPanel7.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 48, 100, -1));
        jPanel7.add(jTextField27, new org.netbeans.lib.awtextra.AbsoluteConstraints(904, 45, 250, -1));

        btCancel.setText("Hủy");
        btCancel.setPreferredSize(new java.awt.Dimension(75, 23));
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });

        btSave.setText("Ghi");
        btSave.setPreferredSize(new java.awt.Dimension(75, 23));
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        btSua.setText("Sửa");
        btSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(btSua, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123)
                .addComponent(btCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btSua))
                        .addContainerGap(18, Short.MAX_VALUE))))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1176, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public SimpleDateFormat ns = new SimpleDateFormat("dd-mm-yyyy");
    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
   //     stateButton(true);
          if (validateInput()) {
            dispose();					
	}
    }//GEN-LAST:event_btSaveActionPerformed

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
   //      stateButton(true);// TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btCancelActionPerformed

    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        // TODO add your handling code here:
                int MaNV = Integer.parseInt(jTextField1.getText());	
                String cbPhai = jComboBox1.getSelectedItem().toString() ;
		int CMND = Integer.parseInt(jTextField2.getText());           
                SimpleDateFormat ns = new   SimpleDateFormat("dd-MM-yyyy");
                String NgayCapCM = ns.format(jDateChooser5.getDate());                     
                String cbNoiCapCM = jComboBox6.getSelectedItem().toString() ;
                String Sothe = jTextField8.getText();
                String HoTen = jTextField15.getText();                
                String NamSinh = ns.format(jDateChooser4.getDate());   
                String cbNS = jComboBox5.getSelectedItem().toString() ;                            
                String DiaChiThuongTru = jTextField3.getText();
                String DiaChiTamTru = jTextField4.getText();
                int DienThoaiThuongChu = Integer.parseInt(jTextField16.getText());
                int DiDong = Integer.parseInt(jTextField17.getText());
                String Email = jTextField5.getText();
                String NgayVaoDoan = ns.format(jDateChooser6.getDate());                
                String NgayVaoDang = ns.format(jDateChooser7.getDate());
                String cbDt = jComboBox2.getSelectedItem().toString() ;
                String cbTG = jComboBox4.getSelectedItem().toString() ;
                String cbQuocTich = jComboBox7.getSelectedItem().toString() ;
                int Passport = Integer.parseInt(jTextField6.getText());
                String NgayCapPassport = ns.format(jDateChooser8.getDate());
                String NoiCapPassport = jTextField19.getText();                                
                String cbTTHN = jComboBox3.getSelectedItem().toString() ;
                int MaSoThue = Integer.parseInt(jTextField13.getText());
                String NgayCapMST = ns.format(jDateChooser9.getDate());
                int SoTaiKhoan = Integer.parseInt(jTextField7.getText());
                String MaTaiKhoan = jTextField14.getText();
                String cbNH = jComboBox9.getSelectedItem().toString() ;
                String cbTD = jComboBox8.getSelectedItem().toString() ;
                String cbBC = jComboBox11.getSelectedItem().toString() ;
                String HocHam = jTextField22.getText();
                String ChuyenMon = jTextField21.getText();
                String KNLVChuyenMon = jTextField23.getText();
		String cbLNV = jComboBox10.getSelectedItem().toString() ;
                String cbDV = jComboBox12.getSelectedItem().toString() ;
                String cbPB = jComboBox14.getSelectedItem().toString() ;
                String cbBP = jComboBox16.getSelectedItem().toString() ;
                String cbCD = jComboBox13.getSelectedItem().toString() ;     
                String cbCV = jComboBox15.getSelectedItem().toString() ;                
                String cbDDLV = jComboBox17.getSelectedItem().toString() ;
                String LuongTV = jTextField25.getText() ;
                String LuongCB = jTextField26.getText();
                String LuongKD = jTextField27.getText();
                String NgayVaoCty = ns.format(jDateChooser2.getDate());
                String NgayHetHanTV = ns.format(jDateChooser3.getDate());
                String NgayVaoChinhThuc = ns.format(jDateChooser10.getDate());  
                employeeModel = new Employee();                
		employeeModel.setMaNV(MaNV);
		employeeModel.setPhai(cbPhai);                
		employeeModel.setCMND(CMND);
                employeeModel.setNgayCapCMND(NgayCapCM);
                employeeModel.setNoiCapCMND(cbNoiCapCM);
                employeeModel.setSothe(Sothe);
                employeeModel.setHoTen(HoTen);
                employeeModel.setNamSinh(NamSinh);
                employeeModel.setNoiSinh(cbNS);
                employeeModel.setDiaChiThuongTru(DiaChiThuongTru);
                employeeModel.setDiaChiTamTru(DiaChiTamTru);
                employeeModel.setDienThoaiThuongTru(DienThoaiThuongChu);
                employeeModel.setDiDong(DiDong);
                employeeModel.setEmail(Email);
                employeeModel.setNgayVaoDoan(NgayVaoDoan);
                employeeModel.setNgayVaoDang(NgayVaoDang);
                employeeModel.setDanToc(cbDt);
                employeeModel.setTonGiao(cbTG);
                employeeModel.setQuocTich(cbQuocTich);               
		employeeModel.setPassport(Passport);
                employeeModel.setNgayCapPassport(NgayCapPassport);
                employeeModel.setNoiCapPassport(NoiCapPassport);
                employeeModel.setTinhTrangHonNhan(cbTTHN);
                employeeModel.setMaSoThue(MaSoThue);
                employeeModel.setNgayCapMST(NgayCapMST);
                employeeModel.setSoTaiKhoan(SoTaiKhoan);
                employeeModel.setMaTaiKhoan(MaTaiKhoan);
                employeeModel.setNganHang(cbNH);
                employeeModel.setTrinhDo(cbTD);
                employeeModel.setBangCap(cbBC);
                employeeModel.setHocHam(HocHam);
                employeeModel.setChuyenMon(ChuyenMon);
                employeeModel.setKNLVChuyenMon(KNLVChuyenMon);
                employeeModel.setLoaiNhanVien(cbLNV);
                employeeModel.setDonVi(cbDV);
                employeeModel.setPhongBan(cbPB);
                employeeModel.setBoPhan(cbBP);
                employeeModel.setChucDanh(cbCD);
                employeeModel.setChucVu(cbCV);
                employeeModel.setDiaDiemLamViec(cbDDLV);
                employeeModel.setLuongThuViec(LuongTV);
                employeeModel.setLuongCB(LuongCB);
                employeeModel.setLuongKD(LuongKD);
                employeeModel.setNgayVaoCty(NgayVaoCty);
                employeeModel.setNgayVaoChinhThuc(NgayVaoChinhThuc);
                employeeModel.setNgayHetHanTV(NgayHetHanTV);
                employeeBLL.EditEmployeeDAL(employeeModel);	
                btSave.setEnabled(false);
                dispose();
    }//GEN-LAST:event_btSuaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EmployeeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancel;
    public javax.swing.JButton btSave;
    private javax.swing.JButton btSua;
    private javax.swing.JButton jButton1;
    public javax.swing.JComboBox<String> jComboBox1;
    public javax.swing.JComboBox<String> jComboBox10;
    public javax.swing.JComboBox<String> jComboBox11;
    public javax.swing.JComboBox<String> jComboBox12;
    public javax.swing.JComboBox<String> jComboBox13;
    public javax.swing.JComboBox<String> jComboBox14;
    public javax.swing.JComboBox<String> jComboBox15;
    public javax.swing.JComboBox<String> jComboBox16;
    public javax.swing.JComboBox<String> jComboBox17;
    public javax.swing.JComboBox<String> jComboBox2;
    public javax.swing.JComboBox<String> jComboBox3;
    public javax.swing.JComboBox<String> jComboBox4;
    public javax.swing.JComboBox<String> jComboBox5;
    public javax.swing.JComboBox<String> jComboBox6;
    public javax.swing.JComboBox<String> jComboBox7;
    public javax.swing.JComboBox<String> jComboBox8;
    public javax.swing.JComboBox<String> jComboBox9;
    public com.toedter.calendar.JDateChooser jDateChooser10;
    public com.toedter.calendar.JDateChooser jDateChooser2;
    public com.toedter.calendar.JDateChooser jDateChooser3;
    public com.toedter.calendar.JDateChooser jDateChooser4;
    public com.toedter.calendar.JDateChooser jDateChooser5;
    public com.toedter.calendar.JDateChooser jDateChooser6;
    public com.toedter.calendar.JDateChooser jDateChooser7;
    public com.toedter.calendar.JDateChooser jDateChooser8;
    public com.toedter.calendar.JDateChooser jDateChooser9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField13;
    public javax.swing.JTextField jTextField14;
    public javax.swing.JTextField jTextField15;
    public javax.swing.JTextField jTextField16;
    public javax.swing.JTextField jTextField17;
    public javax.swing.JTextField jTextField19;
    public javax.swing.JTextField jTextField2;
    public javax.swing.JTextField jTextField21;
    public javax.swing.JTextField jTextField22;
    public javax.swing.JTextField jTextField23;
    public javax.swing.JTextField jTextField24;
    public javax.swing.JTextField jTextField25;
    public javax.swing.JTextField jTextField26;
    public javax.swing.JTextField jTextField27;
    public javax.swing.JTextField jTextField3;
    public javax.swing.JTextField jTextField4;
    public javax.swing.JTextField jTextField5;
    public javax.swing.JTextField jTextField6;
    public javax.swing.JTextField jTextField7;
    public javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
