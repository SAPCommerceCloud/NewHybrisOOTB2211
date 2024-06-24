package de.hybris.sapcomm.core.dao;

import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.sapcomm.core.model.MemberDetailsCronjobModel;
import de.hybris.sapcomm.core.model.MemberDetailsModel;

import java.util.List;

public class MemberDetailsDao {
    public FlexibleSearchService getFlexibleSearchService() {
        return flexibleSearchService;
    }

    public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }

    private FlexibleSearchService flexibleSearchService;

    public List<MemberDetailsModel> memberDetailsInfo(byte age) {
        final FlexibleSearchQuery searchQuery = new FlexibleSearchQuery("SELECT {M.PK} FROM{MemberDetails AS M} WHERE {memberAge}>?age");
        searchQuery.addQueryParameter("Age", age);
        final SearchResult<MemberDetailsModel> searchResult = getFlexibleSearchService().search(searchQuery);
        return searchResult.getResult();
    }
}
