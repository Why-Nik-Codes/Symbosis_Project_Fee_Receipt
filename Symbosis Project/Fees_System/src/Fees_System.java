
import java.awt.print.PrinterException;
import java.util.Date;


public class Fees_System extends javax.swing.JFrame {

    public Fees_System() {
        initComponents();
    }


    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        father_name_label = new javax.swing.JLabel();
        student_name_label = new javax.swing.JLabel();
        batch_time_label = new javax.swing.JLabel();
        fees_amnt_label = new javax.swing.JLabel();
        mobile_no_label = new javax.swing.JLabel();
        roll_no_label = new javax.swing.JLabel();
        dept_name_label = new javax.swing.JLabel();
        Section_label = new javax.swing.JLabel();
        address_label = new javax.swing.JLabel();
        father_name = new javax.swing.JTextField();
        fees_amnt = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        roll_no = new javax.swing.JTextField();
        dept_name = new javax.swing.JTextField();
        section_name = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        batch_time = new javax.swing.JTextField();
        mobile_no = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        reset = new javax.swing.JButton();
        print = new javax.swing.JButton();
        generate = new javax.swing.JButton();
        Male = new javax.swing.JRadioButton();
        Female = new javax.swing.JRadioButton();
        full_scholar = new javax.swing.JCheckBox();
        half_scholar = new javax.swing.JCheckBox();
        gender_label = new javax.swing.JLabel();
        scholarship_label = new javax.swing.JLabel();
        none_scholar = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 18));
        jLabel1.setText("                    Fees Receipt System");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));

        father_name_label.setFont(new java.awt.Font("Nikhil Kurle", 1, 12)); // NOI18N
        father_name_label.setText("Enter Father's Name:");

        student_name_label.setFont(new java.awt.Font("Nikhil Kurle", 1, 12)); // NOI18N
        student_name_label.setText("Enter Student Name:");

        batch_time_label.setFont(new java.awt.Font("Nikhil Kurle", 1, 12)); // NOI18N
        batch_time_label.setText("Enter Batch Timimg :");

        fees_amnt_label.setFont(new java.awt.Font("Nikhil Kurle", 1, 12)); // NOI18N
        fees_amnt_label.setText("Enter Fees Amount  :");

        mobile_no_label.setFont(new java.awt.Font("Nikhil Kurle", 1, 12)); // NOI18N
        mobile_no_label.setText("Enter Mobile No      :");

        roll_no_label.setFont(new java.awt.Font("Nikhil Kurle", 1, 12)); // NOI18N
        roll_no_label.setText("Enter Roll   No        :");

        dept_name_label.setFont(new java.awt.Font("Nikhil Kurle", 1, 12)); // NOI18N
        dept_name_label.setText("Enter Dept Name     :");

        Section_label.setFont(new java.awt.Font("Nikhil Kurle", 1, 12)); // NOI18N
        Section_label.setText("Enter Section          :");

        address_label.setFont(new java.awt.Font("Nikhil Kurle", 1, 12)); // NOI18N
        address_label.setText("Enter  Address        :");

        father_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                father_nameActionPerformed(evt);
            }
        });

        fees_amnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fees_amntActionPerformed(evt);
            }
        });

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        roll_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roll_noActionPerformed(evt);
            }
        });

        dept_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dept_nameActionPerformed(evt);
            }
        });

        section_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                section_nameActionPerformed(evt);
            }
        });

        batch_time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batch_timeActionPerformed(evt);
            }
        });

        mobile_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobile_noActionPerformed(evt);
            }
        });

        area.setColumns(20);
        area.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        reset.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 51, 51));
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        print.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        generate.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        generate.setForeground(new java.awt.Color(0, 0, 204));
        generate.setText("Generate Receipt");
        generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateActionPerformed(evt);
            }
        });

        Male.setText("Male");
        Male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleActionPerformed(evt);
            }
        });

        Female.setText("female");
        Female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemaleActionPerformed(evt);
            }
        });

        full_scholar.setText("Full");
        full_scholar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                full_scholarActionPerformed(evt);
            }
        });

        half_scholar.setText("Half");
        half_scholar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                half_scholarActionPerformed(evt);
            }
        });

        gender_label.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        gender_label.setText("Gender                   :");

        scholarship_label.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        scholarship_label.setText("Scholarship             : ");

        none_scholar.setText("None");
        none_scholar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                none_scholarActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sinhgad.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(generate, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(batch_time_label, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(batch_time, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Section_label, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(section_name, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(mobile_no_label, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(mobile_no, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(roll_no_label, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(roll_no, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(dept_name_label, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(dept_name, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(address_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(gender_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(scholarship_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(full_scholar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(half_scholar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(Male, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(Female, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(none_scholar))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(student_name_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(father_name_label, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(father_name, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fees_amnt_label, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fees_amnt, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 24, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(student_name_label)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(father_name_label)
                            .addComponent(father_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(roll_no_label, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roll_no, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dept_name_label)
                            .addComponent(dept_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(batch_time_label, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(batch_time, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Section_label)
                            .addComponent(section_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mobile_no_label)
                            .addComponent(mobile_no, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fees_amnt_label)
                            .addComponent(fees_amnt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(address_label)
                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Female)
                            .addComponent(Male)
                            .addComponent(gender_label, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(scholarship_label)
                            .addComponent(full_scholar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(half_scholar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(none_scholar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(generate, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        // TODO add your handling code here:
        try{
        area.print();
        }catch(PrinterException e){
            
        }
    }//GEN-LAST:event_printActionPerformed

    private void generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateActionPerformed
        // TODO add your handling code here:
        area.setText("\n                       *****************************************************\n");
        area.setText(area.getText() + "                                               **Fees Receipt**\n");
        area.setText(area.getText() + "                       *****************************************************\n");

        Date obj = new Date();

        String date = obj.toString();

        area.setText(area.getText() + "\n\nDate  : " + date + "\n\n");
        area.setText(area.getText() + "Student Name         :   " + name.getText() + "\n\n");
        area.setText(area.getText() + "Father Name           :   " + father_name.getText() + "\n\n");
        area.setText(area.getText() + "Amount Submitted  :   " + fees_amnt.getText() + "\n\n");
        area.setText(area.getText() + "Roll no                     :   " + roll_no.getText() + "\n\n");
        area.setText(area.getText() + "Department             :   " + dept_name.getText() + "\n\n");
        area.setText(area.getText() + "Section                    :   " + section_name.getText() + "\n\n");
        area.setText(area.getText() + "Batch Time              :   " + batch_time.getText() + "\n\n");
        area.setText(area.getText() + "Mobile No               :   " + mobile_no.getText() + "\n\n");
        area.setText(area.getText() + "Address                   :   " + address.getText() + "\n\n");
        if(Male.isSelected()) area.setText(area.getText() + "Gender                    :   Female"+"\n\n");
        else if(Female.isSelected()) area.setText(area.getText() + "Gender                    :   Male"+"\n\n");
        if(full_scholar.isSelected()) area.setText(area.getText() + "Scholarship              :   Full"+"\n\n");
        else if(half_scholar.isSelected()) area.setText(area.getText() + "Scholarship              :   Half"+"\n\n");
        else if(none_scholar.isSelected()) area.setText(area.getText() + "Scholarship              :   None"+"\n\n");
        area.setText(area.getText() + "\n\n\n\n                                                                              Signature\n");


    }//GEN-LAST:event_generateActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        area.setText("");
        //all fields to null
        name.setText("");
        father_name.setText("");
        roll_no.setText("");
        dept_name.setText("");
        section_name.setText("");
        batch_time.setText("");
        mobile_no.setText("");
        address.setText("");
        fees_amnt.setText("");
        
         Male.setEnabled(true);
         Female.setEnabled(true);
         full_scholar.setEnabled(true);
         half_scholar.setEnabled(true);
         none_scholar.setEnabled(true);
         
         
        Male.setSelected(false);
        Female.setSelected(false);
        
        full_scholar.setSelected(false);
        half_scholar.setSelected(false);
        none_scholar.setSelected(false);
        
    }//GEN-LAST:event_resetActionPerformed

    private void fees_amntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fees_amntActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fees_amntActionPerformed

    private void mobile_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobile_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobile_noActionPerformed

    private void batch_timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batch_timeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_batch_timeActionPerformed

    private void father_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_father_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_father_nameActionPerformed

    private void section_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_section_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_section_nameActionPerformed

    private void dept_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dept_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dept_nameActionPerformed

    private void roll_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roll_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roll_noActionPerformed

    private void FemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemaleActionPerformed
        // TODO add your handling code here:
        if(Female.isSelected()) Male.setEnabled(false);
        if(!Female.isSelected()) Male.setEnabled(true);
    }//GEN-LAST:event_FemaleActionPerformed

    private void none_scholarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_none_scholarActionPerformed
        // TODO add your handling code here:
          if(none_scholar.isSelected()){
            full_scholar.setEnabled(false);
            half_scholar.setEnabled(false);
        }
        else{
            full_scholar.setEnabled(true);
            half_scholar.setEnabled(true);
        }
    }//GEN-LAST:event_none_scholarActionPerformed

    private void MaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleActionPerformed
        // TODO add your handling code here:
        if(Male.isSelected()) Female.setEnabled(false);
        if(!Male.isSelected()) Female.setEnabled(true);
    }//GEN-LAST:event_MaleActionPerformed

    private void full_scholarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_full_scholarActionPerformed
        // TODO add your handling code here:
        if(full_scholar.isSelected()){
            half_scholar.setEnabled(false);
            none_scholar.setEnabled(false);
        }
        else{
            half_scholar.setEnabled(true);
            none_scholar.setEnabled(true);
        }
    }//GEN-LAST:event_full_scholarActionPerformed

    private void half_scholarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_half_scholarActionPerformed
        // TODO add your handling code here:
         if(half_scholar.isSelected()){
            full_scholar.setEnabled(false);
            none_scholar.setEnabled(false);
        }
        else{
            full_scholar.setEnabled(true);
            none_scholar.setEnabled(true);
        }
    }//GEN-LAST:event_half_scholarActionPerformed

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
            java.util.logging.Logger.getLogger(Fees_System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fees_System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fees_System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fees_System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fees_System().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Female;
    private javax.swing.JRadioButton Male;
    private javax.swing.JLabel Section_label;
    private javax.swing.JTextField address;
    private javax.swing.JLabel address_label;
    private javax.swing.JTextArea area;
    private javax.swing.JTextField batch_time;
    private javax.swing.JLabel batch_time_label;
    private javax.swing.JTextField dept_name;
    private javax.swing.JLabel dept_name_label;
    private javax.swing.JTextField father_name;
    private javax.swing.JLabel father_name_label;
    private javax.swing.JTextField fees_amnt;
    private javax.swing.JLabel fees_amnt_label;
    private javax.swing.JCheckBox full_scholar;
    private javax.swing.JLabel gender_label;
    private javax.swing.JButton generate;
    private javax.swing.JCheckBox half_scholar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mobile_no;
    private javax.swing.JLabel mobile_no_label;
    private javax.swing.JTextField name;
    private javax.swing.JCheckBox none_scholar;
    private javax.swing.JButton print;
    private javax.swing.JButton reset;
    private javax.swing.JTextField roll_no;
    private javax.swing.JLabel roll_no_label;
    private javax.swing.JLabel scholarship_label;
    private javax.swing.JTextField section_name;
    private javax.swing.JLabel student_name_label;
    // End of variables declaration//GEN-END:variables
}
