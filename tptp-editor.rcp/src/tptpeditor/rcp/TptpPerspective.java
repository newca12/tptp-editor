package tptpeditor.rcp;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;


public class TptpPerspective implements IPerspectiveFactory {

    public void createInitialLayout(IPageLayout layout) {
    	
    	String editorArea = layout.getEditorArea();
		layout.setEditorAreaVisible(false);
		layout.setFixed(true);
		//layout.addStandaloneView(tptpeditor.rcp.View.ID,  false, IPageLayout.LEFT, 0.25f, editorArea);

    }

}
