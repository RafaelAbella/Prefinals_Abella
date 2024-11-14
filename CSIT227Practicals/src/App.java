import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

public class App {
    private JPanel pnlMain;
    private JRadioButton rbCustomer;
    private JRadioButton rbClerk;
    private JRadioButton rbManager;
    private JTextField tfName;
    private JTextArea taPersons;
    private JButton btnSave;
    private JTextField tfAge;
    private JTextField tfMonths;
    private JTextField tfSalary;
    private JButton btnClear;
    private JTextField tfLoad;
    private JButton btnLoad;
    private JButton btnSayHi;
    private JButton btnSavePerson;
    private JButton btnLoadPerson;
    private JButton btnReward;

    private List<Person> persons;

    public App() {
        persons = new ArrayList<>();
        // TODO add implementations for all milestones here
        ButtonGroup bg=new ButtonGroup();
        bg.add(rbClerk);
        bg.add(rbCustomer);
        bg.add(rbManager);

    //public void ActionPerformed

        taPersons.setEditable(false);
        if(rbCustomer.isSelected()){
            tfMonths.setEditable(false);
            tfSalary.setEditable(false);
        }
    }

    public JPanel getPanel(){
        return pnlMain;
    }
    public static void main(String[] args) {
        // add here how to make GUI visible
        App appPanel=new App();

        JFrame frame=new JFrame("Practical");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,400);
        frame.setVisible(true);
        frame.setContentPane(appPanel.getPanel());
    }

    static void giveReward(int n) {

    }
}
