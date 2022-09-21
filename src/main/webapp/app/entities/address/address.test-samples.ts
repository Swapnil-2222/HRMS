import dayjs from 'dayjs/esm';

import { AddressType } from 'app/entities/enumerations/address-type.model';

import { IAddress, NewAddress } from './address.model';

export const sampleWithRequiredData: IAddress = {
  id: 88754,
};

export const sampleWithPartialData: IAddress = {
  id: 56265,
  type: AddressType['CURRENT_ADDRESS'],
  address1: 'Buckinghamshire interfaces',
  hasPrefered: false,
  landMark: 'Missouri',
  pincode: 'Outdoors',
  lattitude: 80702,
  mapNavUrl: 'bottom-line',
  lastModified: dayjs('2022-09-21T05:30'),
  createdOn: dayjs('2022-09-21T03:36'),
  isDeleted: false,
  freeField1: 'District',
  freeField2: 'Chair viral Soap',
};

export const sampleWithFullData: IAddress = {
  id: 81916,
  type: AddressType['EMPLOYMENT_ADDRESS'],
  address1: 'intranet',
  address2: 'hack',
  address3: 'dynamic Birr experiences',
  hasPrefered: false,
  landMark: 'synthesizing Handmade intangible',
  pincode: 'quantifying Paraguay',
  lattitude: 62745,
  longitude: 58015,
  mapNavUrl: 'Netherlands wireless Consultant',
  lastModified: dayjs('2022-09-20T13:14'),
  lastModifiedBy: 'experiences Books',
  createdBy: 'Buckinghamshire',
  createdOn: dayjs('2022-09-20T13:19'),
  isDeleted: true,
  freeField1: 'Implementation',
  freeField2: 'SDD',
  freeField3: 'Mouse red',
  freefield4: 'solid',
  freefield5: 'Practical',
};

export const sampleWithNewData: NewAddress = {
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
