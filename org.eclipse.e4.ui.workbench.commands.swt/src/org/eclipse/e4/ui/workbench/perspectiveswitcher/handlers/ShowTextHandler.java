package org.eclipse.e4.ui.workbench.perspectiveswitcher.handlers;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.e4.core.di.annotations.Execute;

public final class ShowTextHandler {
	
	@Execute
	public void execute()
					throws InvocationTargetException, InterruptedException {
		System.out.println("touched");
	}
}
