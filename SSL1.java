import java.util.Scanner;

public class SSL1 {
    Node lastNode;
    static int newData;

	public static void main(String[] args) {
		SSL1 sList = new SSL1();  
        int num=0,data=0,i;

        System.out.println("Enter Number of nodes:");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        
        for(i = 0; i<num;i++){
            System.out.println("Enter data to nodes:");
            Scanner d = new Scanner(System.in);
            data = d.nextInt();
            sList.addAtStart(data);
        }
 
        sList.display();

        sList.lastToStart();
        sList.addAtStart(newData);
        sList.display();
   
	}
	
	class Node{  
        int data;  
        Node next;  
  
        public Node(int data) {  
            this.data = data;  
            this.next = null;  
        }  
    }  
  
    public Node head = null;  
    public Node tail = null;  
  
    
    public void addAtStart(int data) {  
        Node newNode = new Node(data);  
        if(head == null) {  
            head = newNode;  
            tail = newNode;  
        }  
        else {  
            Node temp = head;  
            head = newNode;  
            head.next = temp;  
        }
    }

    public void lastToStart() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }else {
            if(head != tail) {
                Node current = head;
                while(current.next != tail){
                    current = current.next;
                }
                tail = current;
                lastNode = current.next;
                tail.next = null;
            }else {
                head = tail = null;
            }
        }

        newData = lastNode.data;
        System.out.println("last node:" + newData);
    }

    public void display() {  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.println("Adding nodes from start of the list: ");  
        while(current != null) {  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
        System.out.println();  
    }  
}

