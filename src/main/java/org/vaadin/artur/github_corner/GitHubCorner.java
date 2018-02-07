package org.vaadin.artur.github_corner;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;

@Tag("github-corner")
@HtmlImport("bower_components/github-corner/github-corner.html")
public class GitHubCorner extends Component {

    private static PropertyDescriptor<String, String> propertyHref = PropertyDescriptors
            .propertyWithDefault("href", "");

    public GitHubCorner(String githubUser, String githubRepository) {
        this("https://github.com/" + githubUser + "/" + githubRepository);
    }

    public GitHubCorner(String githubUrl) {
        setHref(githubUrl);
    }

    public void setHref(String href) {
        propertyHref.set(this, href);
    }

    public String getHref() {
        return propertyHref.get(this);
    }
}
