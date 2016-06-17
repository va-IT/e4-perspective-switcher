package org.eclipse.e4.ui.workbench.perspectiveswitcher.handlers;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.workbench.perspectiveswitcher.tools.E4PerspectiveSwitcherPreferences;

public final class CloseHandler {
  @Execute
  public void execute(@Preference(nodePath = E4PerspectiveSwitcherPreferences.ROOT_PREFERENCES_NODE) IEclipsePreferences prefs,
      @Optional MElementContainer menuItem) throws InvocationTargetException, InterruptedException {
    // control.removePerspectiveShortcut(perspective);
    System.out.println("close");
  }
}
