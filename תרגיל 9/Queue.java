package mytor;

public class Queue {
	private int[] Tor;
	private int front,rear;
	public Queue() {
		Tor = new int[100];
		front =0;
		rear=-1;
	}
	public void Insert(int num) {
		if(rear<99)
			Tor[++rear]=num;
		else System.out.println("Queue full");
	}
	public int Remove() {
		return Tor[front++];
	}
	public boolean IsEmpty() {
		if(rear<front)
			return true;
		return false;
	}
}
