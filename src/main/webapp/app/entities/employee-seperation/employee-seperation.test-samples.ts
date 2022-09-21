import dayjs from 'dayjs/esm';

import { SeperationStatus } from 'app/entities/enumerations/seperation-status.model';

import { IEmployeeSeperation, NewEmployeeSeperation } from './employee-seperation.model';

export const sampleWithRequiredData: IEmployeeSeperation = {
  id: 80860,
};

export const sampleWithPartialData: IEmployeeSeperation = {
  id: 33278,
  comment: 'exploit card Squares',
  createdOn: dayjs('2022-09-20T11:32'),
  freefield3: 'Handmade',
  freefield4: 'Plastic',
};

export const sampleWithFullData: IEmployeeSeperation = {
  id: 80970,
  reasonForSeperation: 'Buckinghamshire Liaison Expanded',
  seperationDate: dayjs('2022-09-21T08:47'),
  comment: 'Coordinator',
  seperationStatus: SeperationStatus['REVOKED'],
  otherReason: 'Avon up Hawaii',
  nagotiatedPeriod: 61895,
  createdBy: 'programming',
  updatedOn: dayjs('2022-09-21T06:41'),
  createdOn: dayjs('2022-09-20T12:26'),
  lastModified: dayjs('2022-09-20T23:00'),
  lastModifiedBy: 'THX quantifying Dakota',
  freefield1: 'Haven Accounts relationships',
  freefield2: 'Synergistic needs-based didactic',
  freefield3: 'Generic',
  freefield4: 'indexing Future Fresh',
  freefield5: 'Concrete',
};

export const sampleWithNewData: NewEmployeeSeperation = {
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
