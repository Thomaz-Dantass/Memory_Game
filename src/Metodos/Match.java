package Methods;

import javax.swing.JButton;

public class Match {

    private int numberBtn;
    private JButton btn;
    private int valueMatch;

    public Match() {
    }

    public Match(int numberBtn, JButton btn, int valueMatch) {
        this.numberBtn = numberBtn;
        this.btn = btn;
        this.valueMatch = valueMatch;
    }

    public int getNumberBtn() {
        return numberBtn;
    }

    public void setNumberBtn(int numberBtn) {
        this.numberBtn = numberBtn;
    }

    public JButton getBtn() {
        return btn;
    }

    public void setBtn(JButton btn) {
        this.btn = btn;
    }

    public int getValueMatch() {
        return valueMatch;
    }

    public void setValueMatch(int valueMatch) {
        this.valueMatch = valueMatch;
    }

    @Override
    public String toString() {
        return "Match{" + "numberBtn=" + numberBtn + ", btn=" + btn + ", valueMatch=" + valueMatch + '}';
    }
    
    

}
