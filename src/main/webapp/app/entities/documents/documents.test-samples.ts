import dayjs from 'dayjs/esm';

import { IDocuments, NewDocuments } from './documents.model';

export const sampleWithRequiredData: IDocuments = {
  id: 7443,
};

export const sampleWithPartialData: IDocuments = {
  id: 80525,
  subtype: 'XSS Berkshire Indiana',
  fileName: 'dynamic',
  filePath: 'coherent',
  fileUrl: 'RAM Berkshire Synchronised',
  issuedDate: dayjs('2022-09-20T17:05'),
  validUpTo: dayjs('2022-09-20T10:51'),
  hasVerified: false,
  remark: 'Re-engineered quantify',
  lastModified: dayjs('2022-09-20T13:51'),
  lastModifiedBy: 'Multi-channelled Customer bus',
  isDeleted: false,
  freeField1: 'Intelligent',
};

export const sampleWithFullData: IDocuments = {
  id: 36552,
  referenceId: 11164,
  type: 'Manager Unbranded',
  subtype: 'exuding',
  fileName: 'Clothing',
  filePath: 'Steel multi-state',
  fileUrl: 'Liaison',
  issuedDate: dayjs('2022-09-20T20:27'),
  validUpTo: dayjs('2022-09-20T22:51'),
  placeOfIssued: 'Soft Towels Handcrafted',
  hasVerified: false,
  remark: 'Plaza calculating green',
  lastModified: dayjs('2022-09-20T12:01'),
  lastModifiedBy: 'functionalities synthesizing',
  createdBy: 'architect Bedfordshire',
  createdOn: dayjs('2022-09-20T21:07'),
  isDeleted: false,
  freeField1: 'schemas aggregate',
  freeField2: 'Licensed leverage',
  freeField3: 'invoice Stream',
};

export const sampleWithNewData: NewDocuments = {
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
