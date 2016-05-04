/*
Team lmaoxD -- Nobel Gautam, Alan Chen, Vincent Liok
APCS2 pd10
HW35 -- Privileged Status Gets You to the Front of the Line
2015-05-05
*/

import java.util.ArrayList;

public class ArrayPriorityQueue<T>
{
    ArrayList<T> _list;
    public ArrayPriorityQueue()
    {
        _list = new ArrayList<T>();
    }
    public void add(T e)
    {
	_list.add(e);
    }
    public T peekMin() 
    {
	T min = _list.get(0);
	for (T x : _list) 
	{
	    if (x.compareTo(min) < 0) 
		min = x;
	}
	return min;
    }
    public T removeMin()
    {
	int min = 0;
	for (int i = 0; i < _list.size(); i++) 
	{
	    if (_list.get(i).compareTo(_list.get(min)) < 0) 
		min = i;
	}
	return _list.remove(i);
    }
    public boolean isEmpty()
    {
	return true;
    }

}
