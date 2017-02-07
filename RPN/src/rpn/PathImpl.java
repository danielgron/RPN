
package rpn;

/**
 *
 * @author Daniel
 * @param <T>
 */
public class PathImpl<T> implements Path<T>{

    private T first;
    private Path<T> rest;


    
    public PathImpl(T first, Path<T> rest){
        this.first = first;
        this.rest = rest;
    }
    
    @Override
    public T getFirst() {
        return first;
    }

    @Override
    public Path<T> getRest() {
        return rest;
    }
    
    @Override
    public void printData(){
        
        Path<T> tempPath = rest;
        Path<T> reverse = new PathImpl(first,null);
        
        T element;
        while (tempPath!= null &&tempPath.getFirst()!=null){
            element = tempPath.getFirst();
            tempPath = tempPath.getRest();
        reverse = new PathImpl(element,reverse);
        
    }
        T next= reverse.getFirst();
         while(next!=null && reverse != null){
            
            System.out.println(">"+next);
            reverse = reverse.getRest();
            if (reverse != null) next = reverse.getFirst();
        }
        System.out.print(System.lineSeparator());
        
    }
    
}
