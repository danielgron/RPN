/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpn;

/**
 *
 * @author Daniel
 */
class PathStack<T> {

    private Path<T> data;

    public PathStack() {
        //data = (T[]) new Object[num];
        data = new PathImpl(null,null);
    }

    public void push(T element) {

        data = new PathImpl(element, data);
    }

    public T pop() {
        T element = data.getFirst();
        data = data.getRest();
        return element;
    }

    public boolean isEmpty() {
        return data.getFirst()==null;
    }
    
    public void printData(){
        data.printData();
    }
}
