package whatever;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.event.AjaxBehaviorEvent;
import javax.inject.Named;

@Named
@SessionScoped
public class MyHandler implements Serializable {

  private static final long serialVersionUID = 1L;
  private MyForm myForm = new MyForm();
  
  public MyForm getMyForm() {
    return myForm;
  }
  
  public void myAction1() {
    System.out.println("Listener 1 called");
  }

  public void myAction2(AjaxBehaviorEvent e) {
    System.out.println("Listener 2 called");
  }

  public void myAction3(AjaxBehaviorEvent e) {
    System.out.println("Listener 3 called");
  }
}
