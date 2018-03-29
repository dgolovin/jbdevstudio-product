package com.jboss.devstudio.core.cheatsheet;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class CheatsheetPreferences extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(CheatsheetStartup.getStore());
	}

	@Override
	public void createFieldEditors() {
		addField(new BooleanFieldEditor(
					"FIRST_START"
					, "Show Guided Development Cheatsheet at startup"
					, getFieldEditorParent()));
	}

}
