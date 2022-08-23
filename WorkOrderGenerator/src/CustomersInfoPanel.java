/**
 * Created by jairo on 12/17/16.
 */

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class CustomersInfoPanel extends JPanel{

    String CUST_NAME ;
    String CUST_PHONE_NUMBER = null;
    String CUST_SECOND_PHONE_NUMBER = null;
    String CUST_EMAIL = null;
    String CUST_ADDRESS = null;
    String KE= null;
    final String PREFFERED_CONTACT_METHOD_EMAIL = "Email";
    final String PREFFERED_CONTACT_METHOD_PHONE = "Phone";
    final String KE_INITIALS = "KE: ";


    final JLabel CUST_NAME_LABEL,
            CUST_EMAIL_JLABEL,
            CUST_SECOND_PHONE_NUMBER_JLABEL,
            CUST_PHONE_NUMBER_JLABEL,
            preffered_contact_method_jlabel;

    JTextField cust_name_textField,
            email_textField,
            phone_number_textField,
            second_phone_number_textField;

    BorderLayout layout = new BorderLayout();
    ButtonGroup preffered_method_button_group, ke_button_group;
    JRadioButton preffered_contactMethod_email,
            preffered_contactMethod_phone,
            preffered_contactMethod_both,
            KE_AZ, KE_MG, KE_DJ, KE_DB, KE_UL, KE_PG, KE_SJ;
    JButton CREATE_WORK_ORDER_BUTTON;

    public CustomersInfoPanel() {
        setBorder(BorderFactory.createTitledBorder("Customers Information"));
        setLayout(new BorderLayout());

        //CUSTOMER INFORMATION LABELS
        CUST_NAME_LABEL = new JLabel("Name: ");
        CUST_EMAIL_JLABEL = new JLabel("Email: ");
        CUST_PHONE_NUMBER_JLABEL = new JLabel("Phone Number: ");
        CUST_SECOND_PHONE_NUMBER_JLABEL = new JLabel("Second Phone Number: ");
        preffered_contact_method_jlabel = new JLabel("Preffered Contact Method: ");

        //CUSTOMER INFORMATION TEXTFIELDS
        cust_name_textField = new JTextField(10);
        //cust_name_textField.addActionListener(new CustomerInfoActionListener());

        email_textField = new JTextField(10);

        phone_number_textField = new JTextField(10);

        second_phone_number_textField = new JTextField(10);

        //BUTTON GROUP AND BUTTONS FOR PREFFERED METHOD OF CONTACT
        preffered_method_button_group = new ButtonGroup();
        preffered_contactMethod_email = new JRadioButton("Email");
        preffered_contactMethod_phone = new JRadioButton("Phone");
        preffered_contactMethod_both = new JRadioButton("Both");

        //ADDING BUTTONS TO BUTTON GROUP
        preffered_method_button_group.add(preffered_contactMethod_email);
        preffered_method_button_group.add(preffered_contactMethod_phone);
        preffered_method_button_group.add(preffered_contactMethod_both);

        //BUTTON GROUP AND BUTTONS FOR KE
        ke_button_group = new ButtonGroup();
        KE_AZ = new JRadioButton("AZ");
        KE_AZ.addActionListener(new KeActionListener());

        KE_MG = new JRadioButton("MG");
        KE_MG.addActionListener(new KeActionListener());

        KE_DJ = new JRadioButton("DJ");
        KE_DJ.addActionListener(new KeActionListener());

        KE_DB = new JRadioButton("DB");
        KE_DB.addActionListener(new KeActionListener());

        KE_UL = new JRadioButton("UL");
        KE_UL.addActionListener(new KeActionListener());

        KE_PG = new JRadioButton("PG");
        KE_PG.addActionListener(new KeActionListener());

        KE_SJ = new JRadioButton("SJ");
        KE_SJ.addActionListener(new KeActionListener());

        //ADDING KE BUTTONS TO BUTTON GROUP
        ke_button_group.add(KE_AZ);
        ke_button_group.add(KE_MG);
        ke_button_group.add(KE_DJ);
        ke_button_group.add(KE_DB);
        ke_button_group.add(KE_UL);
        ke_button_group.add(KE_PG);
        ke_button_group.add(KE_SJ);

        //KE BUTTONS IN THEIR OWN PANEL FOR BETTER ORGANIZATION
        JPanel KE_PANEL = new JPanel();
        KE_PANEL.setBorder(BorderFactory.createTitledBorder("KE"));
        KE_PANEL.add(KE_AZ);
        KE_PANEL.add(KE_DB);
        KE_PANEL.add(KE_DJ);
        KE_PANEL.add(KE_MG);
        KE_PANEL.add(KE_PG);
        KE_PANEL.add(KE_UL);

        //CREATE WORK ORDER BUTTON
        CREATE_WORK_ORDER_BUTTON = new JButton("Generate Work Order");
        CREATE_WORK_ORDER_BUTTON.addActionListener(new ButtonActionListener());

        //CUSTOMERS INFORMATION IN ITS OWN PANEL FOR BETTER ORGANIZATION
        JPanel CUSTOMER_PANEL = new JPanel();
        CUSTOMER_PANEL.setBorder(BorderFactory.createTitledBorder("Customers Info"));
        CUSTOMER_PANEL.add(CUST_NAME_LABEL);
        CUSTOMER_PANEL.add(cust_name_textField);

        CUSTOMER_PANEL.add(CUST_EMAIL_JLABEL);
        CUSTOMER_PANEL.add(email_textField);

        CUSTOMER_PANEL.add(CUST_PHONE_NUMBER_JLABEL);
        CUSTOMER_PANEL.add(phone_number_textField);

        CUSTOMER_PANEL.add(CUST_SECOND_PHONE_NUMBER_JLABEL);
        CUSTOMER_PANEL.add(second_phone_number_textField);

        CUSTOMER_PANEL.add(preffered_contact_method_jlabel);
        CUSTOMER_PANEL.add(preffered_contactMethod_phone);
        CUSTOMER_PANEL.add(preffered_contactMethod_email);
        CUSTOMER_PANEL.add(preffered_contactMethod_both);

        add(CUSTOMER_PANEL, BorderLayout.EAST);
        add(KE_PANEL, BorderLayout.WEST);
        add(CREATE_WORK_ORDER_BUTTON, BorderLayout.SOUTH);

        setVisible(true);

    }

    public class KeActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

            if (KE_AZ.isSelected()) {
                setKE("AZ");
            } else if (KE_DB.isSelected()) {
                setKE("DB");
            } else if (KE_DJ.isSelected()) {
                setKE("DJ");
            } else if (KE_MG.isSelected()) {
                setKE("MG");
            } else if (KE_PG.isSelected()) {
                setKE("PG");
            } else if (KE_SJ.isSelected()) {
                setKE("SJ");
            } else if (KE_UL.isSelected()) {
                setKE("UL");
            } else { setKE("NONE SELECTED"); }
        }

    }

    public class ButtonActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (CREATE_WORK_ORDER_BUTTON.isEnabled()) {
                printCustomersInfor();

            }
        }

    }

    public void printCustomersInfor() {
        System.out.println("KE: " + getKE());

        //Getting customers info
        if(cust_name_textField.getText() != null) {
            setCUST_NAME(cust_name_textField.getText());
            System.out.println("Name: " + getCUST_NAME());
        } else{
            setCUST_NAME(null);
            System.out.println(getCUST_NAME());
        }

        if (phone_number_textField != null) {
            setCUST_PHONE_NUMBER(phone_number_textField.getText());
            System.out.println("Phone Number: " + getCUST_PHONE_NUMBER());
        } else {
            setCUST_PHONE_NUMBER(null);
            System.out.println(getCUST_PHONE_NUMBER());
        }

        if (second_phone_number_textField != null) {
            setCUST_SECOND_PHONE_NUMBER(second_phone_number_textField.getText());
            System.out.println("Second Phone Number: " + getCUST_SECOND_PHONE_NUMBER());
        } else {
            setCUST_SECOND_PHONE_NUMBER(null);
            System.out.println(getCUST_SECOND_PHONE_NUMBER());
        }

        if (email_textField.getText() != null) {
            setCUST_EMAIL(email_textField.getText());
            System.out.println("Email: " + getCUST_EMAIL());
        } else {
            setCUST_EMAIL(null);
            System.out.println(getCUST_EMAIL());
        }

        //PREFFERED CONTACT METHOD
        if (preffered_contactMethod_email.isSelected()) {
            System.out.println("Preffered Contact Method: Email");
        } else if (preffered_contactMethod_phone.isSelected()) {
            System.out.println("Preffered Contact Method: Phone");
        } else if(preffered_contactMethod_both.isSelected()) {
            System.out.println("Preffered Contact Method: Both");
        }

    }

    public String getCUST_NAME() {
        return CUST_NAME;
    }

    public void setCUST_NAME(String CUST_NAME) {
        this.CUST_NAME = CUST_NAME;
    }

    public String getCUST_PHONE_NUMBER() {
        return CUST_PHONE_NUMBER;
    }

    public void setCUST_PHONE_NUMBER(String CUST_PHONE_NUMBER) {
        this.CUST_PHONE_NUMBER = CUST_PHONE_NUMBER;
    }

    public String getCUST_SECOND_PHONE_NUMBER() {
        return CUST_SECOND_PHONE_NUMBER;
    }

    public void setCUST_SECOND_PHONE_NUMBER(String CUST_SECOND_PHONE_NUMBER) {
        this.CUST_SECOND_PHONE_NUMBER = CUST_SECOND_PHONE_NUMBER;
    }

    public String getCUST_EMAIL() {
        return CUST_EMAIL;
    }

    public void setCUST_EMAIL(String CUST_EMAIL) {
        this.CUST_EMAIL = CUST_EMAIL;
    }

    public String getCUST_ADDRESS() {
        return CUST_ADDRESS;
    }

    public void setCUST_ADDRESS(String CUST_ADDRESS) {
        this.CUST_ADDRESS = CUST_ADDRESS;
    }

    public String getKE() {
        return KE;
    }

    public void setKE(String KE) {
        this.KE = KE;
    }
}
