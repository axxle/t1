package hello;

import javax.swing.JFrame;

public class HelloWorld extends JFrame { //�������� �� JFrame �� �������� ��� ���������������� ����
	
	
	
	public static void main1(String[] args) {
		System.out.println("Hello, World5!");
	}



  public HelloWorld(){
    super("My First Window"); //��������� ����
    setBounds(100, 100, 200, 200); //���� �� ��������� 
                                   //������ � ��������� 
                                   //�� ���� ����� ������ � ����������
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //��� ����� ��� ���� ����� ��� 
                                                    //�������� ���� ����������� � ���������,
                                                    //����� ��� ��������� ������ � ���������
  }

  public static void main(String[] args) { //��� ������� ����� ���� � � ������ ������
    HelloWorld app = new HelloWorld(); //������� ��������� ������ ����������
    app.setVisible(true); //� ����� ������� ���������� ��������!
	main1(null);
  }
}