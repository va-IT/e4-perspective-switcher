package org.eclipse.e4.ui.workbench.perspectiveswitcher.handlers;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.e4.ui.workbench.perspectiveswitcher.tools.E4PerspectiveSwitcherPreferences;
import org.osgi.service.prefs.BackingStoreException;

public final class ShowTextHandler {
	
	@Execute
	public void execute(@Preference(nodePath=E4PerspectiveSwitcherPreferences.ROOT_PREFERENCES_NODE) IEclipsePreferences prefs)
					throws InvocationTargetException, InterruptedException {
	    String currentValue = prefs.get(E4PerspectiveSwitcherPreferences.SHOW_TEXT, Boolean.FALSE.toString());
	    
	    prefs.put(E4PerspectiveSwitcherPreferences.SHOW_TEXT, String.valueOf(!Boolean.valueOf(currentValue)));
		
	    try {
            prefs.flush();
        } catch (BackingStoreException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}
}
