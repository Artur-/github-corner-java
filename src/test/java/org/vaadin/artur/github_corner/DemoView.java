package org.vaadin.artur.github_corner;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route("")
public class DemoView extends Div {

    public DemoView() {
        GitHubCorner githubCorner = new GitHubCorner("Artur-",
                "github-corner-java");
        add(githubCorner);
    }
}
