package SampleTreeFileView;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import UI.CreateFolderScreen;


public class Controller {
    private Model model;
    private View view;
    //private ActionListener actionListener;
    private ActionListener openFileActionListener;
    private ActionListener uploadFileActionListener;
    
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
		
		uploadFileActionListener = new ActionListener() {
			
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					try {
						CreateFolderScreen bla = new CreateFolderScreen();
						
					} catch(Throwable t) {
						//showThrowable(t);
					}
					view.getMenuBar().getMenu(1).getItem(1).addActionListener(uploadFileActionListener);
					view.getGui().repaint();
					
				}
			};
      }

	public void setVisible(boolean b) {
	 view.setVisible(b);
	}
       
}