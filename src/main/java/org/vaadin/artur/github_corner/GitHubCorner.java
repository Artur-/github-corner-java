package org.vaadin.artur.github_corner;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.html.Anchor;

@Tag("github-corner")
@NpmPackage(value = "github-corner", version = "2.0.3")
@JsModule("github-corner/index.js")
public class GitHubCorner extends Component {

    private Anchor anchor;

    public GitHubCorner(String githubUser, String githubRepository) {
        this("https://github.com/" + githubUser + "/" + githubRepository);
    }

    public GitHubCorner(String githubUrl) {
        this.anchor = new Anchor();
        getElement().appendChild(this.anchor.getElement());
        setHref(githubUrl);
    }

    public void setHref(String href) {
        anchor.setHref(href);
    }

    public String getHref() {
        return anchor.getHref();
    }
}
