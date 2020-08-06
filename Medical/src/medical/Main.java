package medical;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;


public class Main extends javax.swing.JFrame {
    
    public Main() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DoctorsLabel = new javax.swing.JLabel();
        DoctorsListScroller = new javax.swing.JScrollPane();
        DoctorsList = new javax.swing.JList<>();
        DocNameLabel = new javax.swing.JLabel();
        DocSpecLabel = new javax.swing.JLabel();
        DocPhoneLabel = new javax.swing.JLabel();
        DoctorName = new javax.swing.JTextField();
        DoctorSpecialization = new javax.swing.JTextField();
        DoctorPhone = new javax.swing.JTextField();
        AddUpdateDoctor = new javax.swing.JButton();
        DeletePatient = new javax.swing.JButton();
        PatientsLabel = new javax.swing.JLabel();
        PatientsListScroller = new javax.swing.JScrollPane();
        PatientsList = new javax.swing.JList<>();
        PatientNameLabel = new javax.swing.JLabel();
        PatientName = new javax.swing.JTextField();
        PatientAMKALabel = new javax.swing.JLabel();
        PatientAMKA = new javax.swing.JTextField();
        PatientAgeLabel = new javax.swing.JLabel();
        PatientAge = new javax.swing.JTextField();
        PatientPhoneLabel = new javax.swing.JLabel();
        PatientPhone = new javax.swing.JTextField();
        AddUpdatePatient = new javax.swing.JButton();
        AppointmentsLabel = new javax.swing.JLabel();
        AppointmentsListScroller = new javax.swing.JScrollPane();
        AppointmentsList = new javax.swing.JList<>();
        AppoinmentDateTimeLabel = new javax.swing.JLabel();
        AppointmentDateTime = new javax.swing.JTextField();
        AppointmentReasonLabel = new javax.swing.JLabel();
        AppointmentReason = new javax.swing.JTextField();
        ExaminationsLabel = new javax.swing.JLabel();
        ExaminationsListScroller = new javax.swing.JScrollPane();
        ExaminationsList = new javax.swing.JList<>();
        ExaminationDateTimeLabel = new javax.swing.JLabel();
        ExaminationDateTime = new javax.swing.JTextField();
        ExaminationTitleLabel = new javax.swing.JLabel();
        ExaminationTitle = new javax.swing.JTextField();
        ExaminationDescriptionLabel = new javax.swing.JLabel();
        DescriptionScroller = new javax.swing.JScrollPane();
        ExaminationDescription = new javax.swing.JTextArea();
        AddUpdateExamination = new javax.swing.JButton();
        AddUpdateAppointment = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Medical");
        setPreferredSize(new java.awt.Dimension(1090, 900));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        DoctorsLabel.setText("Doctors:");

        DoctorsList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DoctorsListMouseClicked(evt);
            }
        });
        DoctorsListScroller.setViewportView(DoctorsList);

        DocNameLabel.setText("Name:");

        DocSpecLabel.setText("Specialization:");

        DocPhoneLabel.setText("Phone:");

        AddUpdateDoctor.setText("ADD/UPDATE DOCTOR");
        AddUpdateDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddUpdateDoctorActionPerformed(evt);
            }
        });

        DeletePatient.setText("DELETE PATIENT");
        DeletePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletePatientActionPerformed(evt);
            }
        });

        PatientsLabel.setText("Patients:");

        PatientsList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PatientsListMouseClicked(evt);
            }
        });
        PatientsListScroller.setViewportView(PatientsList);

        PatientNameLabel.setText("Name:");

        PatientAMKALabel.setText("AMKA:");

        PatientAgeLabel.setText("Age:");

        PatientPhoneLabel.setText("Phone:");

        AddUpdatePatient.setText("ADD/UPDATE PATIENT");
        AddUpdatePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddUpdatePatientActionPerformed(evt);
            }
        });

        AppointmentsLabel.setText("Appointments:");

        AppointmentsList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AppointmentsListMouseClicked(evt);
            }
        });
        AppointmentsListScroller.setViewportView(AppointmentsList);

        AppoinmentDateTimeLabel.setText("Date & Time:");

        AppointmentReasonLabel.setText("Reason:");

        ExaminationsLabel.setText("Examinations:");

        ExaminationsList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExaminationsListMouseClicked(evt);
            }
        });
        ExaminationsListScroller.setViewportView(ExaminationsList);

        ExaminationDateTimeLabel.setText("Date & Time:");

        ExaminationTitleLabel.setText("Title:");

        ExaminationDescriptionLabel.setText("Description:");

        ExaminationDescription.setColumns(20);
        ExaminationDescription.setRows(5);
        DescriptionScroller.setViewportView(ExaminationDescription);

        AddUpdateExamination.setText("ADD/UPDATE EXAMINATION");
        AddUpdateExamination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddUpdateExaminationActionPerformed(evt);
            }
        });

        AddUpdateAppointment.setText("ADD/UPDATE APPOINTMENT");
        AddUpdateAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddUpdateAppointmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DoctorsLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AppointmentsListScroller, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AppointmentDateTime)
                                    .addComponent(AppointmentReason)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(AppoinmentDateTimeLabel)
                                            .addComponent(AppointmentReasonLabel)
                                            .addComponent(AddUpdateAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DoctorsListScroller, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(AddUpdateDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(6, 6, 6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(DocPhoneLabel)
                                            .addComponent(DoctorPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                                            .addComponent(DoctorSpecialization)
                                            .addComponent(DocSpecLabel)
                                            .addComponent(DocNameLabel)
                                            .addComponent(DoctorName))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AppointmentsLabel)
                        .addGap(450, 450, 450)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ExaminationsLabel)
                            .addComponent(PatientsLabel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ExaminationsListScroller, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                            .addComponent(PatientsListScroller))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddUpdatePatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ExaminationDateTime)
                            .addComponent(PatientName)
                            .addComponent(PatientAMKA)
                            .addComponent(PatientAge)
                            .addComponent(PatientPhone)
                            .addComponent(AddUpdateExamination, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                            .addComponent(DeletePatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DescriptionScroller, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                            .addComponent(ExaminationTitle)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ExaminationDateTimeLabel)
                                    .addComponent(PatientPhoneLabel)
                                    .addComponent(PatientAgeLabel)
                                    .addComponent(PatientAMKALabel)
                                    .addComponent(PatientNameLabel)
                                    .addComponent(ExaminationDescriptionLabel)
                                    .addComponent(ExaminationTitleLabel))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DoctorsLabel)
                    .addComponent(PatientsLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PatientNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PatientAMKALabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PatientAMKA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PatientAgeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PatientAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PatientPhoneLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PatientPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AddUpdatePatient)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DeletePatient))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DocNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DocSpecLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DoctorSpecialization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DocPhoneLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DoctorPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AddUpdateDoctor))
                    .addComponent(PatientsListScroller, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                    .addComponent(DoctorsListScroller))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AppointmentsLabel)
                    .addComponent(ExaminationsLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ExaminationsListScroller)
                    .addComponent(AppointmentsListScroller)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AppoinmentDateTimeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AppointmentDateTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AppointmentReasonLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AppointmentReason, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(AddUpdateAppointment))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ExaminationDateTimeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ExaminationDateTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ExaminationTitleLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ExaminationTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ExaminationDescriptionLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DescriptionScroller, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(AddUpdateExamination)
                        .addGap(0, 143, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    String query = null;
    
    String[][] doctorsTable, patientsTable, appointmentsTable, examinationsTable;
    DefaultListModel listModelD, listModelP, listModelA, listModelE;
        
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        listModelD = new DefaultListModel();
        listModelP = new DefaultListModel();
        listModelA = new DefaultListModel();
        listModelE = new DefaultListModel();
        
        try {
            
            try {
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            con = DriverManager.getConnection("jdbc:postgresql://localhost/Medical", "postgres", "123");
            
            updateDoctorsTable();
            
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_formWindowOpened
    
    private void updateDoctorsTable() throws SQLException{
        
        if(!listModelD.isEmpty()){
            listModelD = (DefaultListModel) DoctorsList.getModel();
            listModelD.removeAllElements();
        }
        
        query = "{CALL getalldoctors}";
        
        try{
            
            CallableStatement stmt1 = con.prepareCall(query, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = stmt1.executeQuery();
            
            rs.last();
            
            if(rs.getRow() == 0){
                
                DoctorName.setText("");
                DoctorSpecialization.setText("");
                DoctorPhone.setText("");
                
                updatePatientsTable();
                
                return;
                
            }
            
            doctorsTable = new String[rs.getRow()][4];
            
            rs.first();
            
            do {
                
                doctorsTable[rs.getRow()-1][0] = Integer.toString(rs.getInt(1));
                doctorsTable[rs.getRow()-1][1] = rs.getString(2);
                doctorsTable[rs.getRow()-1][2] = rs.getString(3);
                doctorsTable[rs.getRow()-1][3] = rs.getString(4);
                
                listModelD.addElement(rs.getString(2));
                
            } while(rs.next());
            
            DoctorsList.setModel(listModelD);
            
            DoctorsList.setSelectedIndex(0);
            DoctorName.setText(doctorsTable[0][1]);
            DoctorSpecialization.setText(doctorsTable[0][2]);
            DoctorPhone.setText(doctorsTable[0][3]);
            
            updatePatientsTable();
            
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private void updatePatientsTable() throws SQLException{
        
        if(!listModelP.isEmpty()){
            listModelP = (DefaultListModel) PatientsList.getModel();
            listModelP.removeAllElements();
        }
        
        query = "{CALL showpatients(?)}";
        
        try {
            
            if(DoctorsList.getModel().getSize() == 0){
                
                PatientName.setText("");
                PatientAMKA.setText("");
                PatientAge.setText("");
                PatientPhone.setText("");
                
                UpdateAppointmentsTable();
                UpdateExaminationsTable();
                
                return;
                
            }

            
            CallableStatement stmt1 = con.prepareCall(query, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stmt1.setInt(1, Integer.parseInt(doctorsTable[DoctorsList.getSelectedIndex()][0]));
            rs = stmt1.executeQuery();
                       
            rs.last();
            
            if(rs.getRow() == 0){
                
                PatientName.setText("");
                PatientAMKA.setText("");
                PatientAge.setText("");
                PatientPhone.setText("");
                
                UpdateAppointmentsTable();
                UpdateExaminationsTable();
                
                return;
                
            }
            
            patientsTable = new String[rs.getRow()][6];
            
            rs.first();
                        
            do {
                
                patientsTable[rs.getRow()-1][0] = Integer.toString(rs.getInt(1));
                patientsTable[rs.getRow()-1][1] = Integer.toString(rs.getInt(2));
                patientsTable[rs.getRow()-1][2] = rs.getString(3);
                patientsTable[rs.getRow()-1][3] = rs.getString(4);
                patientsTable[rs.getRow()-1][4] = rs.getString(5);
                patientsTable[rs.getRow()-1][5] = rs.getString(6);
                
                listModelP.addElement(rs.getString(3));
                
            } while(rs.next());
            
            PatientsList.setModel(listModelP);
            
            PatientsList.setSelectedIndex(0);
            PatientName.setText(patientsTable[0][2]);
            PatientAMKA.setText(patientsTable[0][3]);
            PatientAge.setText(patientsTable[0][4]);
            PatientPhone.setText(patientsTable[0][5]);
            
            UpdateAppointmentsTable();
            UpdateExaminationsTable();
            
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private void UpdateAppointmentsTable(){
        
        if(!listModelA.isEmpty()){
            listModelA = (DefaultListModel) AppointmentsList.getModel();
            listModelA.removeAllElements();
        }
        
        query = "{CALL showappointments(?)}";
        
        try {
            
            if(PatientsList.getModel().getSize() == 0){
                AppointmentDateTime.setText("");
                AppointmentReason.setText("");
                return;
            }
            
            CallableStatement stmt1 = con.prepareCall(query, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stmt1.setInt(1, Integer.parseInt(patientsTable[PatientsList.getSelectedIndex()][0]));
            rs = stmt1.executeQuery();
                   
            rs.last();
            
            if(rs.getRow() == 0){
                AppointmentDateTime.setText("");
                AppointmentReason.setText("");
                return;
            }
            
            appointmentsTable = new String[rs.getRow()][4];
            
            rs.first();
            
            do {
                
                appointmentsTable[rs.getRow()-1][0] = Integer.toString(rs.getInt(1));
                appointmentsTable[rs.getRow()-1][1] = Integer.toString(rs.getInt(2));
                appointmentsTable[rs.getRow()-1][2] = rs.getString(3);
                appointmentsTable[rs.getRow()-1][3] = rs.getString(4);
                
                listModelA.addElement(rs.getString(3));
                
            } while(rs.next());
            
            AppointmentsList.setModel(listModelA);
            
            AppointmentsList.setSelectedIndex(0);
            AppointmentDateTime.setText(appointmentsTable[0][2]);
            AppointmentReason.setText(appointmentsTable[0][3]);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    private void UpdateExaminationsTable(){
        
        if(!listModelE.isEmpty()){
            listModelE = (DefaultListModel) ExaminationsList.getModel();
            listModelE.removeAllElements();
        }
        
        query = "{CALL showexaminations(?)}";
        
        try {
            
            if(PatientsList.getModel().getSize() == 0){
                ExaminationDateTime.setText("");
                ExaminationTitle.setText("");
                ExaminationDescription.setText("");
                return;
            }
            
            CallableStatement stmt1 = con.prepareCall(query, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stmt1.setInt(1, Integer.parseInt(patientsTable[PatientsList.getSelectedIndex()][0]));
            rs = stmt1.executeQuery();
            
            rs.last();
            
            if(rs.getRow() == 0){
                ExaminationDateTime.setText("");
                ExaminationTitle.setText("");
                ExaminationDescription.setText("");
                return;
            }
            
            examinationsTable = new String[rs.getRow()][6];
            
            rs.first();
            
            do {
                
                examinationsTable[rs.getRow()-1][0] = Integer.toString(rs.getInt(1));
                examinationsTable[rs.getRow()-1][1] = Integer.toString(rs.getInt(2));
                examinationsTable[rs.getRow()-1][2] = Integer.toString(rs.getInt(3));
                examinationsTable[rs.getRow()-1][3] = rs.getString(4);
                examinationsTable[rs.getRow()-1][4] = rs.getString(5);
                examinationsTable[rs.getRow()-1][5] = rs.getString(6);
                
                listModelE.addElement(rs.getString(4));
                
            } while(rs.next());
            
            ExaminationsList.setModel(listModelE);
            
            ExaminationsList.setSelectedIndex(0);
            ExaminationDateTime.setText(examinationsTable[0][3]);
            ExaminationTitle.setText(examinationsTable[0][4]);
            ExaminationDescription.setText(examinationsTable[0][5]);
            
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    private void AddUpdateDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddUpdateDoctorActionPerformed
                    
        if(DoctorsList.getModel().getSize() > 0 && doctorsTable[DoctorsList.getSelectedIndex()][1].equals(DoctorName.getText())){
        
            query = "{CALL updatedoctorinfo(?, ?, ?, ?)}";

            try {

                CallableStatement stmt1 = con.prepareCall(query) ;

                stmt1.setInt(1, Integer.parseInt(doctorsTable[DoctorsList.getSelectedIndex()][0]));
                stmt1.setString(2, DoctorName.getText());
                stmt1.setString(3, DoctorSpecialization.getText());
                stmt1.setString(4, DoctorPhone.getText());

                stmt1.executeQuery();

                updateDoctorsTable();

            } catch (SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }else{
            
            query = "{CALL adddoctor(?, ?, ?)}";

            try {

                CallableStatement stmt1 = con.prepareCall(query) ;

                stmt1.setString(1, DoctorName.getText());
                stmt1.setString(2, DoctorSpecialization.getText());
                stmt1.setString(3, DoctorPhone.getText());

                stmt1.executeQuery();

                updateDoctorsTable();

            } catch (SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }            
            
        }
        
    }//GEN-LAST:event_AddUpdateDoctorActionPerformed
            
    private void DeletePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletePatientActionPerformed
        
        if(PatientsList.getModel().getSize() > 0){
        
            query = "{CALL deletepatient(?)}";

            try {

                CallableStatement stmt1 = con.prepareCall(query);
                stmt1.setInt(1, Integer.parseInt(patientsTable[PatientsList.getSelectedIndex()][0]));
                stmt1.executeQuery();

                PatientName.setText("");
                PatientAMKA.setText("");
                PatientAge.setText("");
                PatientPhone.setText("");

                AppointmentDateTime.setText("");
                AppointmentReason.setText("");

                ExaminationDateTime.setText("");
                ExaminationTitle.setText("");
                ExaminationDescription.setText("");

                listModelA.clear();
                AppointmentsList.setModel(listModelA);

                listModelE.clear();
                ExaminationsList.setModel(listModelE);

                updatePatientsTable();

            } catch (SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
    }//GEN-LAST:event_DeletePatientActionPerformed
    
    private void AddUpdatePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddUpdatePatientActionPerformed
        
        if(PatientsList.getModel().getSize() > 0 && patientsTable[PatientsList.getSelectedIndex()][2].equals(PatientName.getText())){
        
            query = "{CALL updatepatientinfo(?, ?, ?, ?, ?)}";

            try {

                CallableStatement stmt1 = con.prepareCall(query) ;

                stmt1.setInt(1, Integer.parseInt(patientsTable[PatientsList.getSelectedIndex()][0]));
                stmt1.setString(2, PatientName.getText());
                stmt1.setString(3, PatientAMKA.getText());
                stmt1.setString(4, PatientAge.getText());
                stmt1.setString(5, PatientPhone.getText());

                stmt1.executeQuery();

                updatePatientsTable();

            } catch (SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }else{
            
            query = "{CALL addpatient(?, ?, ?, ?, ?)}";

            try {

                CallableStatement stmt1 = con.prepareCall(query) ;

                stmt1.setInt(1, Integer.parseInt(doctorsTable[DoctorsList.getSelectedIndex()][0]));
                stmt1.setString(2, PatientName.getText());
                stmt1.setString(3, PatientAMKA.getText());
                stmt1.setString(4, PatientAge.getText());
                stmt1.setString(5, PatientPhone.getText());

                stmt1.executeQuery();

                updatePatientsTable();

            } catch (SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }//GEN-LAST:event_AddUpdatePatientActionPerformed
    
    private void AddUpdateExaminationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddUpdateExaminationActionPerformed
        
        if(ExaminationsList.getModel().getSize() > 0 && examinationsTable[ExaminationsList.getSelectedIndex()][3].equals(ExaminationDateTime.getText())){
            
            query = "{CALL updateexamination(?, ?, ?, ?)}";
            
            try {
                
                CallableStatement stmt1 = con.prepareCall(query) ;
                
                stmt1.setInt(1, Integer.parseInt(examinationsTable[ExaminationsList.getSelectedIndex()][0]));
                stmt1.setString(2, ExaminationDateTime.getText());
                stmt1.setString(3, ExaminationTitle.getText());
                stmt1.setString(4, ExaminationDescription.getText());
                
                stmt1.executeQuery();
                
                UpdateExaminationsTable();
                
            } catch (SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else{
            
            query = "{CALL addexamination(?, ?, ?, ?, ?)}";
            
            try {
                
                CallableStatement stmt1 = con.prepareCall(query) ;
                
                stmt1.setInt(1, Integer.parseInt(patientsTable[PatientsList.getSelectedIndex()][0]));
                stmt1.setInt(2, Integer.parseInt(doctorsTable[DoctorsList.getSelectedIndex()][0]));
                stmt1.setString(3, ExaminationDateTime.getText());
                stmt1.setString(4, ExaminationTitle.getText());
                stmt1.setString(5, ExaminationDescription.getText());
                
                stmt1.executeQuery();
                
                UpdateExaminationsTable();
                
            } catch (SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }//GEN-LAST:event_AddUpdateExaminationActionPerformed
    
    private void AddUpdateAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddUpdateAppointmentActionPerformed
        
        if(AppointmentsList.getModel().getSize() > 0 && appointmentsTable[AppointmentsList.getSelectedIndex()][2].equals(AppointmentDateTime.getText())){
            
            query = "{CALL updateappointment(?, ?, ?)}";
            
            try {
                
                CallableStatement stmt1 = con.prepareCall(query) ;
                
                stmt1.setInt(1, Integer.parseInt(appointmentsTable[AppointmentsList.getSelectedIndex()][0]));
                stmt1.setString(2, AppointmentDateTime.getText());
                stmt1.setString(3, AppointmentReason.getText());
                
                stmt1.executeQuery();
                
                UpdateAppointmentsTable();
                
            } catch (SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else{
            
            query = "{CALL addAppointment(?, ?, ?)}";
            
            try {
                
                CallableStatement stmt1 = con.prepareCall(query) ;
                
                stmt1.setInt(1, Integer.parseInt(patientsTable[PatientsList.getSelectedIndex()][0]));
                stmt1.setString(2, AppointmentDateTime.getText());
                stmt1.setString(3, AppointmentReason.getText());
                
                stmt1.executeQuery();
                
                UpdateAppointmentsTable();
                
            } catch (SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }//GEN-LAST:event_AddUpdateAppointmentActionPerformed
    
    private void DoctorsListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoctorsListMouseClicked
        
        if(DoctorsList.getModel().getSize() > 0){
            
            DoctorName.setText(doctorsTable[DoctorsList.getSelectedIndex()][1]);
            DoctorSpecialization.setText(doctorsTable[DoctorsList.getSelectedIndex()][2]);
            DoctorPhone.setText(doctorsTable[DoctorsList.getSelectedIndex()][3]);
            
            try {
                updatePatientsTable();
            } catch (SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }//GEN-LAST:event_DoctorsListMouseClicked
    
    private void PatientsListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PatientsListMouseClicked
        
        if(PatientsList.getModel().getSize() > 0){
            
            PatientName.setText(patientsTable[PatientsList.getSelectedIndex()][2]);
            PatientAMKA.setText(patientsTable[PatientsList.getSelectedIndex()][3]);
            PatientAge.setText(patientsTable[PatientsList.getSelectedIndex()][4]);
            PatientPhone.setText(patientsTable[PatientsList.getSelectedIndex()][5]);
            
            UpdateExaminationsTable();
            UpdateAppointmentsTable();
            
        }
        
    }//GEN-LAST:event_PatientsListMouseClicked
    
    private void AppointmentsListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AppointmentsListMouseClicked
        
        if(AppointmentsList.getModel().getSize() > 0){
            AppointmentDateTime.setText(appointmentsTable[AppointmentsList.getSelectedIndex()][2]);
            AppointmentReason.setText(appointmentsTable[AppointmentsList.getSelectedIndex()][3]);
        }
        
    }//GEN-LAST:event_AppointmentsListMouseClicked
    
    private void ExaminationsListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExaminationsListMouseClicked
        
        if(ExaminationsList.getModel().getSize() > 0){
            ExaminationDateTime.setText(examinationsTable[ExaminationsList.getSelectedIndex()][3]);
            ExaminationTitle.setText(examinationsTable[ExaminationsList.getSelectedIndex()][4]);
            ExaminationDescription.setText(examinationsTable[ExaminationsList.getSelectedIndex()][5]);
        }
        
    }//GEN-LAST:event_ExaminationsListMouseClicked
    
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddUpdateAppointment;
    private javax.swing.JButton AddUpdateDoctor;
    private javax.swing.JButton AddUpdateExamination;
    private javax.swing.JButton AddUpdatePatient;
    private javax.swing.JLabel AppoinmentDateTimeLabel;
    private javax.swing.JTextField AppointmentDateTime;
    private javax.swing.JTextField AppointmentReason;
    private javax.swing.JLabel AppointmentReasonLabel;
    private javax.swing.JLabel AppointmentsLabel;
    private javax.swing.JList<String> AppointmentsList;
    private javax.swing.JScrollPane AppointmentsListScroller;
    private javax.swing.JButton DeletePatient;
    private javax.swing.JScrollPane DescriptionScroller;
    private javax.swing.JLabel DocNameLabel;
    private javax.swing.JLabel DocPhoneLabel;
    private javax.swing.JLabel DocSpecLabel;
    private javax.swing.JTextField DoctorName;
    private javax.swing.JTextField DoctorPhone;
    private javax.swing.JTextField DoctorSpecialization;
    private javax.swing.JLabel DoctorsLabel;
    private javax.swing.JList<String> DoctorsList;
    private javax.swing.JScrollPane DoctorsListScroller;
    private javax.swing.JTextField ExaminationDateTime;
    private javax.swing.JLabel ExaminationDateTimeLabel;
    private javax.swing.JTextArea ExaminationDescription;
    private javax.swing.JLabel ExaminationDescriptionLabel;
    private javax.swing.JTextField ExaminationTitle;
    private javax.swing.JLabel ExaminationTitleLabel;
    private javax.swing.JLabel ExaminationsLabel;
    private javax.swing.JList<String> ExaminationsList;
    private javax.swing.JScrollPane ExaminationsListScroller;
    private javax.swing.JTextField PatientAMKA;
    private javax.swing.JLabel PatientAMKALabel;
    private javax.swing.JTextField PatientAge;
    private javax.swing.JLabel PatientAgeLabel;
    private javax.swing.JTextField PatientName;
    private javax.swing.JLabel PatientNameLabel;
    private javax.swing.JTextField PatientPhone;
    private javax.swing.JLabel PatientPhoneLabel;
    private javax.swing.JLabel PatientsLabel;
    private javax.swing.JList<String> PatientsList;
    private javax.swing.JScrollPane PatientsListScroller;
    // End of variables declaration//GEN-END:variables
}
