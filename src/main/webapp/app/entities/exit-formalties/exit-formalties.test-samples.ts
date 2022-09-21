import dayjs from 'dayjs/esm';

import { AnswersOptions } from 'app/entities/enumerations/answers-options.model';
import { Status } from 'app/entities/enumerations/status.model';

import { IExitFormalties, NewExitFormalties } from './exit-formalties.model';

export const sampleWithRequiredData: IExitFormalties = {
  id: 91008,
};

export const sampleWithPartialData: IExitFormalties = {
  id: 13201,
  security: AnswersOptions['NO'],
  feedback: 'compress Intelligent connecting',
  exitDate: dayjs('2022-09-21T02:06'),
  noticePeriodServed: AnswersOptions['YES'],
  clearence: AnswersOptions['NO'],
  orgAssets: AnswersOptions['NO'],
  resignLetter: AnswersOptions['NO'],
  shares: 'Cotton',
  workForOrg: AnswersOptions['YES'],
  freeField2: 'port Checking Future-proofed',
  freeField3: 'bandwidth quantifying Programmable',
  freefield5: 'Chief',
};

export const sampleWithFullData: IExitFormalties = {
  id: 83964,
  security: AnswersOptions['YES'],
  feedback: 'Sleek Louisiana',
  exitDate: dayjs('2022-09-21T09:08'),
  exitInterview: AnswersOptions['NO'],
  libNoDue: AnswersOptions['YES'],
  noticePeriodServed: AnswersOptions['NO'],
  clearence: AnswersOptions['YES'],
  orgAssets: AnswersOptions['NO'],
  orgVehical: AnswersOptions['YES'],
  resignLetter: AnswersOptions['YES'],
  shares: 'Cross-group capacitor Agent',
  staffWelfare: 'Account Loan plum',
  workForOrg: AnswersOptions['NO'],
  status: Status['INACTIVE'],
  lastModified: dayjs('2022-09-21T07:14'),
  lastModifiedBy: 'Savings',
  createdBy: 'Web bypass Front-line',
  createdOn: dayjs('2022-09-20T15:19'),
  isDeleted: false,
  freeField1: 'Fish',
  freeField2: 'green Fresh',
  freeField3: 'invoice Bedfordshire',
  freefield4: 'Way',
  freefield5: 'Handcrafted Peso',
};

export const sampleWithNewData: NewExitFormalties = {
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
