/*
lmao xD -- Nobel Gautam, Alan Chen, Vincent Liok
APCS2 pd10
HW35 -- Privileged Status Gets You to the Front of the Line
2015-05-05
*/

import java.util.ArrayList;

public class ArrayPriorityQueue
{
    ArrayList<Comparable> _list;
    public ArrayPriorityQueue()
    {
        _list = new ArrayList();
    }
    public void add(int e)
    {
	_list.add(e);
    }
    public Object peekMin() 
    {
	Comparable min = _list.get(0);
	for (int i = 0; i < _list.size(); i++) {
	    if (_list.get(i).compareTo(min) < 0)
		min = _list.get(i);
	}
	return min;
    }
    public Object removeMin()
    {
	int min = 0;
	for (int i = 0; i < _list.size(); i++) 
	{
	    if (_list.get(i).compareTo(_list.get(min)) < 0) 
		min = i;
	}
	return _list.remove(min);
    }
    public boolean isEmpty()
    {
	return _list.size() == 0;
    }

    public static void main(String[] args) {
	ArrayPriorityQueue test = new ArrayPriorityQueue();

	test.add(2);
	test.add(3);
	test.add(0);

	System.out.println(test.peekMin());
	System.out.println(test.removeMin());
	System.out.println(test.isEmpty());
	System.out.println(test.removeMin());
	System.out.println(test.removeMin());
	System.out.println(test.isEmpty());
    }
}
