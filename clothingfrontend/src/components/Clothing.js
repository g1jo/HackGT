import StyleSelect from "./Style";
import TempSelect from "./Temp";
import ColorSelect from "./Color";
import * as React from 'react';
import Stack from '@mui/material/Stack';
import Button from '@mui/material/Button';

const temp = TempSelect
const style = StyleSelect
const color = ColorSelect


export default function Buttons() {
  return (
      <Button variant="contained">Add</Button>
  );
}