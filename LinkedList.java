public class LinkedList {
		class Node {
			int data;
			Node next;
			public Node (int data)
			{
				this.data=data;
				this.next=null;
		}
		}
		public Node head = null;
		public Node tail = null;
		public void addNode(int data)
		{
			Node newNode=new Node (data);
			if(head==null)
			{
				head=newNode;
				tail=newNode;
				}
			else
			{
				tail.next=newNode;
				tail=newNode;
			}	
				
			}
			public void deleteNode()
			{
				if(head==null)
				{
					System.out.println("list is empty");
					return;
				}
				else
				{
					if(head!=tail)
					{
						Node current=head;
						while(current.next!=tail)
						{
							current=current.next;
						}
						
						tail=current;
						tail.next=null;
					}
						else
						{
							head=tail=null;
							
						}
					}
				}
				public void display()
				{
					Node current=head;
					if(head==null)
					{
						System.out.println("list is empty");
						return;
						
					}
			
				System.out.println("nodes of singly linked list :");
				while(current!=null)
				{
					System.out.println(current.data+ " ");
					current=current.next;
				}
			System.out.println();
			}
			public static void main(String[] args)
			{
				LinkedList slist=new LinkedList();
				slist.addNode(1);
				slist.addNode(2);
				slist.addNode(3);
				slist.addNode(4);
				slist.display();
				slist.deleteNode();
				slist.display();
			}
		}
				
			
			
			

