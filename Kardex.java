import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

public class Kardex {
    Period selectedPeriod;
    JFrame frame;
    JPanel panel;
    JLabel nameLabel;
    JLabel instructionLabel;
    JLabel gpaLabel;
    JLabel[] subjectLabels = new JLabel[0];
    JLabel[] gradeLabels = new JLabel[0];
    JTextField[] gradeTextFields = new JTextField[0];
    JComboBox<Period> menu;

    static final int LEFT_SIDE_WIDTH = 200;
    static final int LEFT_SIDE_HEIGHT = 20;

    static final int RIGHT_SIDE_WIDTH = 100;
    static final int RIGHT_SIDE_HEIGHT = 20;
    static final int PADDING = 10;

    public static void main(String[] args) {
        Kardex kardex = new Kardex();
        kardex.createWindow();
    }

    public void createWindow() {
        frame = new JFrame("Boleta de calificaciones");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();

        // Left side

        this.nameLabel = new JLabel("Jose Manuel Espinosa López");
        nameLabel.setBounds(5, 10, LEFT_SIDE_WIDTH, LEFT_SIDE_HEIGHT);

        this.instructionLabel = new JLabel("Presiona enter para cambiar calificación");
        instructionLabel.setBounds(300, 10, 500, RIGHT_SIDE_HEIGHT);
        Subject[] firstSubjects = new Subject[6];
        firstSubjects[0] = new Subject("Cálculo Diferencial", 0);
        firstSubjects[1] = new Subject("Fundamentos de Programación", 0);
        firstSubjects[2] = new Subject("Taller de Ética", 0);
        firstSubjects[3] = new Subject("Taller de Administración", 0);
        firstSubjects[4] = new Subject("Fundamentos de Investigación", 0);
        firstSubjects[5] = new Subject("Matemáticas Discretas", 0);

        Period firstPeriod = new Period(firstSubjects, 1);

        Subject secondSubjects[] = new Subject[6];
        secondSubjects[0] = new Subject("Cálculo Itegral", 0);
        secondSubjects[1] = new Subject("Programación Orientada a Objetos", 0);
        secondSubjects[2] = new Subject("Contabilidad Financiera", 0);
        secondSubjects[3] = new Subject("Química", 0);
        secondSubjects[4] = new Subject("Algebra Lineal", 0);
        secondSubjects[5] = new Subject("Probabilidad y Estadística", 0);

        Period secondPeriod = new Period(secondSubjects, 2);

        Subject thirdSubjects[] = new Subject[6];
        thirdSubjects[0] = new Subject("Cálculo Vectorial", 0);
        thirdSubjects[1] = new Subject("Estructura de Datos", 0);
        thirdSubjects[2] = new Subject("Cultura Empresarial", 0);
        thirdSubjects[3] = new Subject("Investigación de Operaciones", 0);
        thirdSubjects[4] = new Subject("Desarrollo Sustentable", 0);
        thirdSubjects[5] = new Subject("Física General", 0);

        Period thirdPeriod = new Period(thirdSubjects, 3);

        Subject fourthSubjects[] = new Subject[6];
        fourthSubjects[0] = new Subject("Ecuaciones Diferenciales", 0);
        fourthSubjects[1] = new Subject("Métodos Numéricos", 0);
        fourthSubjects[2] = new Subject("Tópicos Avanzados de Programación", 0);
        fourthSubjects[3] = new Subject("Fundamentos de bases de Datos", 0);
        fourthSubjects[4] = new Subject("Simulación", 0);
        fourthSubjects[5] = new Subject("Principios Eléctricos y Aplicaciones Digitales", 0);

        Period fourthPeriod = new Period(fourthSubjects, 4);

        Subject fivethSubjects[] = new Subject[6];
        fivethSubjects[0] = new Subject("Graficación", 0);
        fivethSubjects[1] = new Subject("Fundamentos de Telecomunicaciones", 0);
        fivethSubjects[2] = new Subject("Sistemas Operativos", 0);
        fivethSubjects[3] = new Subject("Taller de Bases de Datos", 0);
        fivethSubjects[4] = new Subject("Fundamentos de Ingeniería de Software", 0);
        fivethSubjects[5] = new Subject("Arquitecutura de Computadoras", 0);

        Period fivethPeriod = new Period(fivethSubjects, 5);

        Subject sixthSubjects[] = new Subject[6];
        sixthSubjects[0] = new Subject("Lenguajes Automatas I", 0);
        sixthSubjects[1] = new Subject("Redes de Computadoras", 0);
        sixthSubjects[2] = new Subject("Taller de Sistemas Operativos", 0);
        sixthSubjects[3] = new Subject("Administración de Bases de Datos", 0);
        sixthSubjects[4] = new Subject("Ingeniría de Software", 0);
        sixthSubjects[5] = new Subject("Lenguajes de Interfaz", 0);

        Period sixthPeriod = new Period(sixthSubjects, 6);

        Subject seventhSubjects[] = new Subject[6];
        seventhSubjects[0] = new Subject("Lenguajes Automatas I", 0);
        seventhSubjects[1] = new Subject("Comunicación y Enrutamiento de Redes de Datos", 0);
        seventhSubjects[2] = new Subject("Taller de Investigación I", 0);
        seventhSubjects[3] = new Subject("Administracion de Servidores", 0);
        seventhSubjects[4] = new Subject("Gestion de Proyectos de Software", 0);
        seventhSubjects[5] = new Subject("Sistemas Programables", 0);

        Period seventhPeriod = new Period(seventhSubjects, 7);

        Subject eighthSubjects[] = new Subject[5];
        eighthSubjects[0] = new Subject("Programación Lógica y Funcional", 0);
        eighthSubjects[1] = new Subject("Administración de Redes", 0);
        eighthSubjects[2] = new Subject("Taller de Investigacion II", 0);
        eighthSubjects[3] = new Subject("Programación Web", 0);
        eighthSubjects[4] = new Subject("Desarollo de aplicaciones Android I", 0);

        Period eighthPeriod = new Period(eighthSubjects, 8);

        Subject ninthSubjects[] = new Subject[4];
        ninthSubjects[0] = new Subject("Inteligencia Artificial", 0);
        ninthSubjects[1] = new Subject("Bases de datos para dispositivos Móviles", 0);
        ninthSubjects[2] = new Subject("Residencia Profesional", 0);
        ninthSubjects[3] = new Subject("Desarrollo de Aplicaciones en Android", 0);

        Period ninthPeriod = new Period(ninthSubjects, 9);

        this.menu = new JComboBox<Period>();
        this.menu.addActionListener(new ComboboxListener());
        menu.setBounds(5, 35, 200, LEFT_SIDE_HEIGHT);
        menu.addItem(firstPeriod);
        menu.addItem(secondPeriod);
        menu.addItem(thirdPeriod);
        menu.addItem(fourthPeriod);
        menu.addItem(fivethPeriod);
        menu.addItem(sixthPeriod);
        menu.addItem(seventhPeriod);
        menu.addItem(eighthPeriod);
        menu.addItem(ninthPeriod);
    

        this.gpaLabel = new JLabel("Promedio: 0.0");
        gpaLabel.setBounds(5, 300, LEFT_SIDE_WIDTH, LEFT_SIDE_HEIGHT);

        // Rigth side

        frame.setVisible(true);
        frame.setSize(700, 400);
        frame.add(panel);

        panel.setLayout(null);
        panel.add(nameLabel);
        panel.add(instructionLabel);
        panel.add(menu);

        panel.add(gpaLabel);


    }

    void removeSubjectsFromPanel() {
        for (JLabel subjectLabel : subjectLabels) {
            if (subjectLabel != null)
                panel.remove(subjectLabel);
        }
        for (JLabel gradeLabel : gradeLabels) {
            if (gradeLabel != null)
                panel.remove(gradeLabel);
        }
        for (JTextField gradeTextField : gradeTextFields) {
            if (gradeTextField != null)
                panel.remove(gradeTextField);
        }
        panel.revalidate();
        panel.repaint();
    }

    class ComboboxListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            selectedPeriod = (Period) menu.getSelectedItem();

            if (selectedPeriod.getNumber() < 4) {
                Color color = new Color(34, 113, 179);
                panel.setBackground(color);
            } else if (selectedPeriod.getNumber() < 7) {
                Color color = new Color(236, 226, 198);
                panel.setBackground(color);
            } else {
                Color color = new Color(155, 155, 155);
                panel.setBackground(color);
            }
            Subject[] selectedSubjects = selectedPeriod.getSubjects();
            removeSubjectsFromPanel();
            subjectLabels = new JLabel[selectedSubjects.length];
            gradeLabels = new JLabel[selectedSubjects.length];
            gradeTextFields = new JTextField[selectedSubjects.length];
            int x = 5;
            int y = 50;
            for (int i = 0; i < selectedSubjects.length; i++) {
                Subject subject = selectedSubjects[i];
                subjectLabels[i] = new JLabel(subject.getName());
                subjectLabels[i].setBounds(x, y, LEFT_SIDE_WIDTH, LEFT_SIDE_HEIGHT);
                panel.add(subjectLabels[i]);
                gradeLabels[i] = new JLabel("| Calificación: " + subject.getGrade());
                gradeLabels[i].setBounds(x + LEFT_SIDE_WIDTH + PADDING, y, LEFT_SIDE_WIDTH, LEFT_SIDE_HEIGHT);
                panel.add(gradeLabels[i]);
                gradeTextFields[i] = new JTextField();
                gradeTextFields[i].addActionListener(new SubjectGradeListener(subject, gradeLabels[i]));
                gradeTextFields[i].setBounds(x + LEFT_SIDE_WIDTH * 2 + PADDING, y, LEFT_SIDE_WIDTH, LEFT_SIDE_HEIGHT);
                panel.add(gradeTextFields[i]);
                y += LEFT_SIDE_HEIGHT + PADDING;
            }
            panel.revalidate();
            panel.repaint();
        }

    }

    class SubjectGradeListener implements ActionListener {
        Subject subject;
        JLabel gradeLabel;

        public SubjectGradeListener(Subject subject, JLabel gradeLabel) {
            this.subject = subject;
            this.gradeLabel = gradeLabel;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JTextField gradeTextField = (JTextField) e.getSource();
            String newGrade = gradeTextField.getText();
            try {
                double grade = Double.parseDouble(newGrade);
                if (grade > 10)
                    grade = 10;
                if (grade < 0)
                    grade = 0;
                this.subject.setGrade(grade);
            } catch (Exception x) {
                this.subject.setGrade(0);
            } finally {
                gradeTextField.setText("" + this.subject.getGrade());
                gradeLabel.setText("| Calificación: " + this.subject.getGrade());

                // 1. Actualizar el GPA
                double gpa = selectedPeriod.gpa();
                gpaLabel.setText("Promedio: " + gpa);
                // 2. Cambiar el color del estudiante
                if (gpa >= 6) {
                    nameLabel.setForeground(Color.BLUE);
                } else {
                    nameLabel.setForeground(Color.RED);
                }
                panel.revalidate();
                panel.repaint();
            }
        }

    }

}

class Subject {
    private String name;
    private double grade;

    public Subject(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

}

class Period {
    private Subject subjects[];
    private int number;

    public Period(Subject[] subjects, int number) {
        this.subjects = subjects;
        this.number = number;
    }

    public Subject[] getSubjects() {
        return this.subjects;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double gpa() {

        double sum = 0;

        for (int i = 0; i < subjects.length; i++) {
            Subject subject = subjects[i];
            sum = sum + subject.getGrade();
        }
        double gpa = sum / subjects.length;
        return gpa;

    }

    public String toString() {
        return "Semestre " + this.getNumber() + "º";
    }
}