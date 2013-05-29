package tptpeditor.rcp;

import org.eclipse.swt.graphics.Point;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

public class TptpEditorWorkbenchWindowAdvisor extends WorkbenchWindowAdvisor {

	public TptpEditorWorkbenchWindowAdvisor(
			IWorkbenchWindowConfigurer configurer) {
		super(configurer);
	}

	public ActionBarAdvisor createActionBarAdvisor(
			IActionBarConfigurer configurer) {
		return new ApplicationActionBarAdvisor(configurer);
	}

	public void preWindowOpen() {
		super.preWindowOpen();
		IWorkbenchWindowConfigurer wc = getWindowConfigurer();
		wc.setInitialSize(new Point(600, 450));
		wc.setShowCoolBar(true);
		wc.setShowStatusLine(true);
		wc.setShowProgressIndicator(true);
	}
}
