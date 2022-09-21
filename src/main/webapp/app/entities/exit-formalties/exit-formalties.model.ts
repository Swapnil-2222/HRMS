import dayjs from 'dayjs/esm';
import { IEmployee } from 'app/entities/employee/employee.model';
import { AnswersOptions } from 'app/entities/enumerations/answers-options.model';
import { Status } from 'app/entities/enumerations/status.model';

export interface IExitFormalties {
  id: number;
  security?: AnswersOptions | null;
  feedback?: string | null;
  exitDate?: dayjs.Dayjs | null;
  exitInterview?: AnswersOptions | null;
  libNoDue?: AnswersOptions | null;
  noticePeriodServed?: AnswersOptions | null;
  clearence?: AnswersOptions | null;
  orgAssets?: AnswersOptions | null;
  orgVehical?: AnswersOptions | null;
  resignLetter?: AnswersOptions | null;
  shares?: string | null;
  staffWelfare?: string | null;
  workForOrg?: AnswersOptions | null;
  status?: Status | null;
  lastModified?: dayjs.Dayjs | null;
  lastModifiedBy?: string | null;
  createdBy?: string | null;
  createdOn?: dayjs.Dayjs | null;
  isDeleted?: boolean | null;
  freeField1?: string | null;
  freeField2?: string | null;
  freeField3?: string | null;
  freefield4?: string | null;
  freefield5?: string | null;
  employee?: Pick<IEmployee, 'id'> | null;
}

export type NewExitFormalties = Omit<IExitFormalties, 'id'> & { id: null };
