package melnorme.lang.ide.core;

import LANG_PROJECT_ID.ide.core.LANGUAGE_Core;
import LANG_PROJECT_ID.ide.core.operations.LANGUAGE_ToolManager;

public class LangCore_Actual {
	
	public static final String PLUGIN_ID = LANGUAGE_Core.PLUGIN_ID;
	public static final String NATURE_ID = LANGUAGE_Core.PLUGIN_ID +".nature";
	
	public static final String BUILDER_ID = LANGUAGE_Core.PLUGIN_ID + ".Builder";
	public static final String BUILD_PROBLEM_ID = LangCore.PLUGIN_ID + ".marker.problem";
	
	public static LANGUAGE_ToolManager createToolManagerSingleton() {
		return new LANGUAGE_ToolManager();
	}
	
}