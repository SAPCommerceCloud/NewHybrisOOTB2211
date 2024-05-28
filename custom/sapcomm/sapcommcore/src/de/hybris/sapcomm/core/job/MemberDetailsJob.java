package de.hybris.sapcomm.core.job;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.sapcomm.core.dao.MemberDetailsDao;
import de.hybris.sapcomm.core.model.MemberDetailsCronjobModel;
import de.hybris.sapcomm.core.model.MemberDetailsModel;
import org.apache.log4j.Logger;

import java.util.List;

public class MemberDetailsJob extends AbstractJobPerformable<MemberDetailsCronjobModel> {

    private MemberDetailsDao memberDetailsDao;

    public MemberDetailsDao getMemberDetailsDao() {
        return memberDetailsDao;
    }

    public void setMemberDetailsDao(MemberDetailsDao memberDetailsDao) {
        this.memberDetailsDao = memberDetailsDao;
    }

    private Logger LOG = Logger.getLogger(MemberDetailsJob.class);

    @Override
    public PerformResult perform(MemberDetailsCronjobModel memberDetailsCronjobModel) {
        try {
            List<MemberDetailsModel> memberDetailsModels = memberDetailsDao.memberDetailsInfo(memberDetailsCronjobModel.getAges());
            System.out.println("Total Number of Count is: " + memberDetailsModels.size());
            if (memberDetailsModels != null) {
                LOG.info("We have count in the memberDetails table");
                for (MemberDetailsModel information : memberDetailsModels) {
                    LOG.info("Printing has been started.... from  foreach loop");
                    if (null != information) {
                        System.out.println("Member name:" + information.getMemberName() + "\t" + "Member Age:" + information.getMemberAge() + "\t" + "Member Blood Group :" + information.getMemberBloodGroup());
                    } else {
                        LOG.info("NO information is available");
                    }
                }

            } else {
                LOG.info("There is no count in the table please check the data in the table whether is there any data or not");
            }


        } catch (Exception e) {
            System.out.println(e.toString());
        }

        return new PerformResult(CronJobResult.SUCCESS , CronJobStatus.FINISHED);
    }
}
