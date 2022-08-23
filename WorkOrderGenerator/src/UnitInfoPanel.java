/**
 * Created by jairo on 12/17/16.
 */

import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author jairo
 */
public class UnitInfoPanel extends JPanel {
    String issue_str = null,
            service_to_be_done_str = null,
            password_str = null, data_backup_str = null,
            diagnostics_str = null,
            condition_of_unit_str = null,
            contact_time_str = null,
            av_as_software_str = null,
            kb_security_suite_offered = null,
            os_version_str = null,
            other_concern = null;

    final String data_backup_warning_str = "Data backups do NOT include programs files or applications";

    JLabel issue_label,
            service_to_be_done_label,
            password_label, data_backup_label,
            diagnostics_label,
            condition_of_unit_label,
            contact_time_label,
            av_as_software_label,
            kb_security_suite_offered_label,
            os_version_label,
            other_concern_label;

    JTextField issue_text_field,
            service_to_be_done_text_field,
            password_text_field, data_backup_text_field,
            diagnostics_text_field,
            condition_of_unit_text_field,
            contact_time_text_field,
            av_as_software_text_field,
            kb_security_suite_offered_text_field,
            os_version_text_field,
            other_concern_text_field;

    JRadioButton OS_WINDOWS = new JRadioButton("Windows");
    JRadioButton OS_MACOSX = new JRadioButton("OS X");
    JRadioButton OS_IOS= new JRadioButton("iOS");
    JRadioButton OS_ANDROID = new JRadioButton("Android");
    ButtonGroup OS_ButtonGroup = new ButtonGroup();

    BorderLayout layout = new BorderLayout();
    JPanel unitPanel;

    public UnitInfoPanel() {
        unitPanel = new JPanel();
        unitPanel.setBorder(BorderFactory.createTitledBorder("Units Info"));
        //JLABELS
        issue_label = new JLabel("Issue:");
        service_to_be_done_label = new JLabel("Service to be done: ");
        password_label = new JLabel("Password: ");
        data_backup_label = new JLabel("Data Backup: ");
        diagnostics_label = new JLabel("Diagnostics: ");
        condition_of_unit_label = new JLabel("Condition of unit: ");
        contact_time_label = new JLabel("Contact Time: ");
        av_as_software_label = new JLabel("AV /AS Software on Machine: ");
        kb_security_suite_offered_label = new JLabel("KB Security Suite Offered: ");
        os_version_label = new JLabel("OS Version: ");
        other_concern_label = new JLabel("Other Concerns: ");

        //TEXTFIELDS
        issue_text_field = new JTextField(10);
        service_to_be_done_text_field = new JTextField(10);
        password_text_field = new JTextField(10);
        data_backup_text_field = new JTextField(10);
        diagnostics_text_field = new JTextField(10);
        condition_of_unit_text_field = new JTextField(10);
        contact_time_text_field = new JTextField(10);
        av_as_software_text_field = new JTextField(10);
        kb_security_suite_offered_text_field = new JTextField(10);
        os_version_text_field = new JTextField(10);
        other_concern_text_field = new JTextField(10);

        OS_ButtonGroup.add(OS_WINDOWS);
        OS_ButtonGroup.add(OS_MACOSX);
        OS_ButtonGroup.add(OS_IOS);
        OS_ButtonGroup.add(OS_ANDROID);
    }
}
