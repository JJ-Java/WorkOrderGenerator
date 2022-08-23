/**
 * Created by jairo on 12/17/16.
 */

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author jairo
 */
public class WorkOrderFrame extends JFrame {

    BorderLayout layout = new BorderLayout();

    public WorkOrderFrame() {
        setLayout(layout);
        setSize(900, 900);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new CustomersInfoPanel(), BorderLayout.NORTH);

        pack();
        setVisible(true);
    }

}
