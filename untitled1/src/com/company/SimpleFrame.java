package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.*;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.RowFilter;
import javax.swing.JMenuBar;

public class SimpleFrame extends JFrame {
    private static Table table=new Table();;
    private static JButton Delete;
    private static JTable tab= new JTable(table);;

    SimpleFrame(String s) {
        super(s);
        this.setSize(500, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(3);
        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(table);
        tab.setRowSorter(sorter);
        JTextField filterText = new JTextField(10);

        add(new JScrollPane(tab));
        JPanel North = new JPanel();
        North.setSize(250, 250);
        JMenuBar AddE = new JMenuBar();
        JMenu Add = new JMenu("Добавить");
        JMenuItem NewBook = new JMenuItem("Добавить книгу");
        NewBook.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CreateDialogAddBook();
            }
        });
        JMenuItem NewMagazine = new JMenuItem("Добавить журнал");
        JMenuItem NewTextBook = new JMenuItem("Добавить учебник");
        Add.add(NewBook);
        Add.add(NewMagazine);
        Add.add(NewTextBook);
        AddE.add(Add);
        North.add(AddE);
        North.setLayout(new FlowLayout(FlowLayout.LEFT));
        Delete = new JButton("Удалить");
        Delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int row = tab.getSelectedRow();
                if (row == -1){
                    JOptionPane.showMessageDialog(North,
                            "Вы ничего не выбрали",
                            "Ошибка",
                            JOptionPane.ERROR_MESSAGE
                            );
                    return;
                }
                table.delete(row);
            }
        });
        North.add(Delete);
        JButton Change = new JButton("Изменить");

        Change.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent е) {

                tab.addPropertyChangeListener(new PropertyChangeListener() {
                    @Override
                    public void propertyChange(PropertyChangeEvent evt) {
                        int row = tab.getSelectedRow();
                        table.setValueAt(row);
                    }
                });

            }
        });

        North.add(Change);
        JButton search = new JButton("Поиск");
        North.add(search);
        North.add(filterText, BorderLayout.CENTER);
        search.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = filterText.getText();
                if (text.length() == 0) {
                    sorter.setRowFilter(null);
                } else {
                    sorter.setRowFilter(RowFilter.regexFilter(text));
                }
            }
        });
        add(North, BorderLayout.NORTH);
        setVisible(true);
    }

    public static void CreateDialogAddBook(){
        JDialog dialog=new JDialog();
        dialog.setModal(true);
        dialog.setTitle("Добавление книги");
        dialog.setSize(350, 250);
        //dialog.setDefaultCloseOperation(2);
        GridLayout Grid = new GridLayout(3,2,1,3);
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        panel.setLayout(Grid);
        JLabel AuthorNameLab = new JLabel("Имя автора");
        JTextField AuthorNameField = new JTextField();
        JLabel NameLab = new JLabel("Название книги");
        JTextField NameField = new JTextField();
        JLabel PagesLab = new JLabel("Количество страниц");
        JTextField PagesField = new JTextField();
        JButton AddBookNew = new JButton("Добавить запись");
        panel.add(AuthorNameLab);
        panel.add(AuthorNameField);
        panel.add(NameLab);
        panel.add(NameField);
        panel.add(PagesLab);
        panel.add(PagesField);
        panel2.add(AddBookNew);
        AddBookNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    if (Integer.parseInt(PagesField.getText())>=0){
                        PrintE E = new Book((String)AuthorNameField.getText(),(String) NameField.getText(),Integer.parseInt(PagesField.getText()));
                        table.AddSign(E);
                    }
                    else {
                        JOptionPane.showMessageDialog(panel,
                                " Можно вводить только положительные числа",
                                "Ошибка",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(panel,
                            " Можно вводить только целые числа",
                            "Ошибка",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        dialog.add(panel, BorderLayout.CENTER);
        dialog.add(panel2, BorderLayout.SOUTH);
        dialog.setVisible(true);
    }
    public static void CreateDialogAddMagazine(){}
    public static void CreateDialogAddTextBook(){}
}



