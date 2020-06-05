package advisor.model;

import advisor.model.dto.Page;
import advisor.model.dto.Release;
import advisor.model.service.Advisor;

public class NewReleases extends SpotifyResourceCollection implements PageableSpotifyModel<Release> {

    private final Advisor advisor;

    public NewReleases(Advisor advisor, int pageSize) {
        super(pageSize);
        this.advisor = advisor;
    }

    public Page<Release> firstPage() throws AdvisorException {
        return firstPage(advisor::getNewReleases);
    }

    @Override
    public Page<Release> nextPage() throws AdvisorException {
        return nextPage(advisor::getNewReleases);
    }

    @Override
    public Page<Release> previousPage() throws AdvisorException {
        return previousPage(advisor::getNewReleases);
    }
}
