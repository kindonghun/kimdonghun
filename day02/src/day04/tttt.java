package day04;

import java.util.Scanner;

public class tttt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int basetime = 30; //�⺻�̿�ð�(��)
		int baseuseprice = 3000; //�⺻�̿���(��)
		int addprice = 500; //�߰����(��)
		int addpermuiute = 10; //�д�(��)
		int usetime = 0; //�̿�ð�
		int useprice = 0; //��ü�ݾ�
		
		System.out.println("�̿�ð�:");
		 usetime= sc.nextInt();
		 if(usetime <= basetime) { // �̿�ð� <=�⺻�̿�ð�	  ex) �̿�ð��� 30���̳Ѿ�ÿ� else������ �Ѿ
			 useprice = baseuseprice; //��ü�ݾ� = �⺻�̿���	  ex) 30���Է��ϸ� �⺻�̿��� 3000���� ��µ�.)
		 }else { //������ 						//40���̻�
			 int tmp=(usetime- basetime); // ���ο� tmp ��������	 ex)�߰��ð������ϱ����� tmp��� ��������
			 								//�̿�ð� - �⺻�̿�ð� (tmp�� ����) ex) 50�� - 30�� = 20��
			 tmp =tmp / addpermuiute; // tmp / �߰����   		ex) 20�� /500��  = 50�� tmp �� ����
			 useprice = baseuseprice +(addprice*tmp); //��ü�ݾ� = �⺻�̿��� +(500��*tmp) ex) 3000+(50��*20) = 3000+1000 = 4000��(useprice)
		 }
		 System.out.println("�̿�����:"+useprice+"���Դϴ�");
		
	
	}
}