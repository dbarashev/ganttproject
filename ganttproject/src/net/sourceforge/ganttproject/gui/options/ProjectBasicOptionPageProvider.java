package net.sourceforge.ganttproject.gui.options;

import java.awt.Component;

import net.sourceforge.ganttproject.gui.options.model.GPOptionGroup;

public class ProjectBasicOptionPageProvider extends OptionPageProviderBase {
    private ProjectSettingsPanel mySettingsPanel;
    public ProjectBasicOptionPageProvider() {
        super("project.basic");
    }
    @Override
    public GPOptionGroup[] getOptionGroups() {
        return new GPOptionGroup[0];
    }
    @Override
    public boolean hasCustomComponent() {
        return true;
    }
    @Override
    public Component buildPageComponent() {
        mySettingsPanel = new ProjectSettingsPanel(getProject());
        return OptionPageProviderBase.wrapContentComponent(
            mySettingsPanel, mySettingsPanel.getTitle(), mySettingsPanel.getComment());
    }
    @Override
    public void commit() {
        mySettingsPanel.applyChanges(false);
    }
}
