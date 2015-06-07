package SampleTreeFileView;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controller {
    private Model model;
    private View view;
    //private ActionListener actionListener;
    private ActionListener openFileActionListener;
    
    public Controller(Model model, View view){
        this.model = model;
        this.view = view;      
    }
    
    public void contol(){        
        
        openFileActionListener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					((Desktop) model.getDesktop()).open(view.getCurrentFile());
				} catch(Throwable t) {
					//showThrowable(t);
				}
				view.getOpenFile().addActionListener(openFileActionListener);
				view.getGui().repaint();
				
			}
		};
      }
       
}