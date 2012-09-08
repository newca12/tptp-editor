package tptpeditor.rcp;

import org.eclipse.swt.graphics.Point;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

public class ApplicationWorkbenchAdvisor extends WorkbenchAdvisor {

	private static final String PERSPECTIVE_ID = "tptp-editor.rcp.perspective";

	public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(
			IWorkbenchWindowConfigurer configurer) {
		return new ApplicationWorkbenchWindowAdvisor(configurer) {
			public void preWindowOpen() {
				super.preWindowOpen();
				IWorkbenchWindowConfigurer wc = getWindowConfigurer();
				wc.setInitialSize(new Point(600, 450));
				wc.setShowCoolBar(true);
				wc.setShowStatusLine(true);
				wc.setShowProgressIndicator(true);
			}
		};
	}

	public String getInitialWindowPerspectiveId() {
		return PERSPECTIVE_ID;
	}

}
