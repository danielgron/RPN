
package rpn;

/**
 *
 * @author Daniel
 */
public interface Path <T> {
    
    T getFirst();
    Path<T> getRest();
    void printData();
}
