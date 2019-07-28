/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pthak
 */
public class RenterProfile extends javax.swing.JFrame {

    /**
     * Creates new form RenterProfile
     */
    public RenterProfile() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        renterBooking = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        viewListings = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        listField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dateField = new javax.swing.JTextField();
        bookButton = new javax.swing.JButton();
        tableDisplay8 = new javax.swing.JScrollPane();
        renterTable = new javax.swing.JTable();
        jField12 = new javax.swing.JLabel();
        userField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        userPassword = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        userIdField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        listingField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        bookDate = new javax.swing.JTextField();
        viewListingsCurrent = new javax.swing.JButton();
        cancelBooking = new javax.swing.JButton();
        tableDisplay9 = new javax.swing.JScrollPane();
        viewBookingTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        bookingPassword = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        userComment = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        hostComment = new javax.swing.JTextField();
        userPassComment = new javax.swing.JPasswordField();
        commentHost = new javax.swing.JButton();
        tableDisplay10 = new javax.swing.JScrollPane();
        viewTableComment = new javax.swing.JTable();
        commentField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        renterBooking.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        viewListings.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        viewListings.setText("View all listings");
        viewListings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewListingsActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("List id:");

        listField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        listField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Date:");

        dateField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        bookButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bookButton.setText("Book now!");
        bookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookButtonActionPerformed(evt);
            }
        });

        renterTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "List id", "Name", "City", "Postal Code", "Country", "Description", "Lat", "Long", "Amenities", "Rent", "Dates"
            }
        ));
        tableDisplay8.setViewportView(renterTable);
        if (renterTable.getColumnModel().getColumnCount() > 0) {
            renterTable.getColumnModel().getColumn(0).setHeaderValue("List id");
            renterTable.getColumnModel().getColumn(4).setResizable(false);
        }

        jField12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jField12.setText("User id:");

        userField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Password:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tableDisplay8, javax.swing.GroupLayout.DEFAULT_SIZE, 867, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(viewListings)
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listField, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jField12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(bookButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewListings)
                    .addComponent(jLabel1)
                    .addComponent(listField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookButton)
                    .addComponent(jField12)
                    .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(userPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(tableDisplay8, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        renterBooking.addTab("Renter booking", jPanel1);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("user id:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Listing id:");

        listingField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Booking date:");

        bookDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        viewListingsCurrent.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        viewListingsCurrent.setText("view current listings");
        viewListingsCurrent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewListingsCurrentActionPerformed(evt);
            }
        });

        cancelBooking.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cancelBooking.setText("Cancel booking");
        cancelBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBookingActionPerformed(evt);
            }
        });

        viewBookingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "User id", "Booking date", "List id", "Cancelled"
            }
        ));
        tableDisplay9.setViewportView(viewBookingTable);
        if (viewBookingTable.getColumnModel().getColumnCount() > 0) {
            viewBookingTable.getColumnModel().getColumn(2).setHeaderValue("List id");
        }

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Password:");

        bookingPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableDisplay9, javax.swing.GroupLayout.DEFAULT_SIZE, 887, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bookingPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(userIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel4))
                            .addComponent(viewListingsCurrent))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listingField, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bookDate, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelBooking)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(viewListingsCurrent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(userIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(listingField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(bookDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cancelBooking))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(bookingPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tableDisplay9, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        renterBooking.addTab("View/Cancel booking", jPanel2);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("User id:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Password:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Host id:");

        hostComment.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        userPassComment.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        userPassComment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userPassCommentActionPerformed(evt);
            }
        });

        commentHost.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        commentHost.setText("Add comment");

        viewTableComment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "User id", "Host id", "Place name", "Renting Date"
            }
        ));
        tableDisplay10.setViewportView(viewTableComment);

        commentField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        commentField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commentFieldActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Comment:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tableDisplay10, javax.swing.GroupLayout.DEFAULT_SIZE, 867, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(userComment, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addGap(2, 2, 2)
                                .addComponent(userPassComment, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hostComment, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(commentField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(commentHost)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(userComment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(hostComment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(userPassComment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(commentHost))
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(commentField, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(29, 29, 29)
                .addComponent(tableDisplay10, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addContainerGap())
        );

        renterBooking.addTab("Comment on hosts", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(renterBooking)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(renterBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listFieldActionPerformed

    private void viewListingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewListingsActionPerformed
        
        DefaultTableModel model ;
        model = (DefaultTableModel)renterTable.getModel();
        model.setRowCount(0);
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(NewUser.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            // setup connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_bnb?useSSL=false","root","rootpassword");
         
   
            PreparedStatement ps = conn.prepareStatement("SELECT * from listings L1,listing_dates L2 INNER JOIN listings ON listings.list_id = L2.listings_list_id");
            ResultSet rs = ps.executeQuery();
            System.out.println("listing search works");
            model.setRowCount(1);
            int rowIndex = 0;
            while (rs.next() && rowIndex < model.getRowCount()) {
 
                model.insertRow(rowIndex, 
                        new Object [] {rs.getString("list_id"),rs.getString("list_name"),
                            rs.getString("city"),rs.getString("postal_code"),rs.getString("country"),rs.getString("description"),rs.getString("latitude"),rs.getString("longitude"),rs.getString("amenities"),rs.getString("rent_amount"),rs.getString("dates")});
                rowIndex++;
            }
          
        } catch (SQLException e) {
            System.out.println("error");
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_viewListingsActionPerformed

    private void bookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookButtonActionPerformed
        
        DefaultTableModel model ;
        model = (DefaultTableModel)renterTable.getModel();
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(NewUser.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            // setup connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_bnb?useSSL=false","root","rootpassword");
         
   
            PreparedStatement ps = conn.prepareStatement("INSERT INTO `bookings` (u_id,booking_date,listings_list_id,cancelled) VALUES (?,?,?,false)");
            ps.setString(1,userField.getText());
            ps.setString(2,dateField.getText());
            ps.setString(3,listField.getText());
            ps.executeUpdate();
            System.out.println("Booking worked!");
            
          
        } catch (SQLException e) {
            System.out.println("error");
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_bookButtonActionPerformed

    private void viewListingsCurrentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewListingsCurrentActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model ;
        model = (DefaultTableModel)viewBookingTable.getModel();
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(NewUser.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            // setup connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_bnb?useSSL=false","root","rootpassword");
         
   
            PreparedStatement ps = conn.prepareStatement("SELECT * from bookings WHERE u_id = ?");
            ps.setString(1,userIdField.getText());
            ResultSet rs = ps.executeQuery();
            System.out.println("listing search works");
            int rowIndex = 0;
            while (rs.next() && rowIndex < model.getRowCount()) {
 
                model.insertRow(rowIndex, 
                        new Object [] {rs.getString("u_id"),rs.getString("booking_date"),
                            rs.getString("listings_list_id"),rs.getString("cancelled")});
                rowIndex++;
            }
          
        } catch (SQLException e) {
            System.out.println("error");
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_viewListingsCurrentActionPerformed

    private void cancelBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBookingActionPerformed
       
        DefaultTableModel model ;
        model = (DefaultTableModel)viewBookingTable.getModel();
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(NewUser.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            // setup connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_bnb?useSSL=false","root","rootpassword");
         
   
            PreparedStatement ps = conn.prepareStatement("SELECT * from bookings WHERE u_id = ?");
            ps.setString(1,userIdField.getText());
            ResultSet rs = ps.executeQuery();
            System.out.println("listing search works");
            int rowIndex = 0;
            while (rs.next() && rowIndex < model.getRowCount()) {
 
                model.insertRow(rowIndex, 
                        new Object [] {rs.getString("u_id"),rs.getString("booking_date"),
                            rs.getString("listings_list_id"),rs.getString("cancelled")});
                rowIndex++;
            }
          
        } catch (SQLException e) {
            System.out.println("error");
            System.err.println(e.getMessage());
        }
        
        
        
        
        
    }//GEN-LAST:event_cancelBookingActionPerformed

    private void userPassCommentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userPassCommentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userPassCommentActionPerformed

    private void commentFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commentFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_commentFieldActionPerformed

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
            java.util.logging.Logger.getLogger(RenterProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RenterProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RenterProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RenterProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RenterProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookButton;
    private javax.swing.JTextField bookDate;
    private javax.swing.JPasswordField bookingPassword;
    private javax.swing.JButton cancelBooking;
    private javax.swing.JTextField commentField;
    private javax.swing.JButton commentHost;
    private javax.swing.JTextField dateField;
    private javax.swing.JTextField hostComment;
    private javax.swing.JLabel jField12;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField listField;
    private javax.swing.JTextField listingField;
    private javax.swing.JTabbedPane renterBooking;
    private javax.swing.JTable renterTable;
    private javax.swing.JScrollPane tableDisplay10;
    private javax.swing.JScrollPane tableDisplay8;
    private javax.swing.JScrollPane tableDisplay9;
    private javax.swing.JTextField userComment;
    private javax.swing.JTextField userField;
    private javax.swing.JTextField userIdField;
    private javax.swing.JPasswordField userPassComment;
    private javax.swing.JPasswordField userPassword;
    private javax.swing.JTable viewBookingTable;
    private javax.swing.JButton viewListings;
    private javax.swing.JButton viewListingsCurrent;
    private javax.swing.JTable viewTableComment;
    // End of variables declaration//GEN-END:variables
}
