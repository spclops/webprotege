package edu.stanford.bmir.protege.web.client.ui.ontology.home.projectlist;

/**
 * Author: Matthew Horridge<br>
 * Stanford University<br>
 * Bio-Medical Informatics Research Group<br>
 * Date: 20/01/2012
 */
public class ProjectListDisplaySelectionEvent {

    private ProjectListDisplay projectListDisplay;

    public ProjectListDisplaySelectionEvent(ProjectListDisplay projectListDisplay) {
        this.projectListDisplay = projectListDisplay;
    }

    public ProjectListDisplay getProjectListDisplay() {
        return projectListDisplay;
    }
}